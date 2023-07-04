package irvine.oeis.a217;
// manually 2020-11-24

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000032;
import irvine.oeis.a000.A000045;

/**
 * A217157 a(n) is the least value of k such that the decimal expansion of n^k contains two consecutive identical digits.
 * Superclass for various sequences which look for consecutive digits in
 * some underlying sequence (see the constructor with parameters).
 * @author Georg Fischer
 */
public class A217157 extends AbstractSequence {

  protected int mCount; // number of required digits
  protected int mN; // current index
  protected int mFeatures; // 3 = k, 4 = repeated digit, 5 = number length, 6 = fixed base
  protected int mBase; // base of the number to be raised to some power
  protected int mNumSystem = 10; // base of the number system, normally 10.

  /**
   * A sequence which returns <code>n^k, k &gt;= 0</code>.
   */
  private static class PowSeries extends Sequence0 {
    
    private final Z mNum;
    private Z mTerm;
    
    PowSeries(final Z num) {
      mNum = num;
      mTerm = Z.ONE; // n^0
    }

    @Override
    public Z next() {
      final Z result = mTerm;
      mTerm = mTerm.multiply(mNum);
      return result;
    }
  } // PowSeries
  
  /**
   * Empty constructor
   */
  public A217157() {
    this(2, 0x11, 2, 0);
  }

  /**
   * Constructor with parameters for various features.
   * @param offset index of first term
   * @param features several variants encoded in two nibbles of a byte.
   * The high nibble (0xf0) tells the underlying sequence:
   * <ul>
   * <li>1 = n^k</li>
   * <li>2 = base^k</li>
   * <li>3 = Fibonacci</li>
   * <li>4 = Lucas</li>
   * </ul>
   * The low nibble (0x0f) tells the kind of the result:
   * <ul>
   * <li>1 = least exponent k</li>
   * <li>2 = repeated digit</li>
   * <li>3 = length of number with repeated digits</li>
   * </ul>
   * @param count number of required digits, or -1 for <code>mBase^k</code>
   * @param base base for powers: 0 for n^k, 2, 3, 5 and so on for A217285-A217292
   */
  public A217157(final int offset, final int features, final int count, final int base) {
    super(offset);
    mN = offset - 1;
    mFeatures = features;
    mCount = count;
    mBase = base;
  }
  
  /**
   * Determine whether <code>count</code> identical consecutive digits can be found in a String.
   * @param count number of consecutive digits
   * @param repr <code>mBase</code> (usually decimal) representation of the number to be investigated
   * @return -1 if not found, or the repeated digit in <code>mBase</code>.
   */
  protected int getIDigit(final int count, final String repr) {
    int result = -1;
    int ic = 0;
    final int limit = repr.length() - count;
    while (ic <= limit) {
      boolean same = count > 0; // assume success
      int jc = ic;
      while (same && jc < ic + count - 1) {
        //== System.out.print("# repr(" + jc + ")=" + repr.charAt(jc) + ", repr(" + String.valueOf(jc + 1) + ")=" + repr.charAt(jc + 1));
        if (repr.charAt(jc) == repr.charAt(jc + 1)) {
          ++jc;
        } else {
          same = false;
        }
        //== System.out.println(" -> " + same);
      } // while same
      if (same) {
        result = Character.digit(repr.charAt(ic), mNumSystem);
        ic = limit + 1; // break loop
      } else {
        ++ic;
      }
    } // while ic
    //== System.out.println("#  getIDigit(count=" + count + ", repr=" + repr + ") -> " + result);
    return result;
  } // getIDigit

  /**
   * Finds the least index of a sequence where the term contains <code>count</code> 
   * consecutive identical digits
   * @param seq sequence of terms
   * @param count number of digits which must be repeated
   * @return either the exponent (1), the repeated digit (2), or the length of the number (3)
   */
  protected Z findLeastK(final Sequence seq, final int count) {
    Z result = null;
    int k = -1;
    boolean found = false;
    while (! found) { // how to prevent infinite looping ??
      ++k;
      final String repr = seq.next().toString(mNumSystem); // = b(k)
      //== System.out.println("# k=" + k + ", repr=" + repr);
      final int idigit = getIDigit(count, repr); // the identical digit
      if (idigit != -1) {
        found = true;
        switch (mFeatures & 0x0f) { // low nibble
          case 1:
            result = Z.valueOf(k);
            break;
          case 2:
            result = Z.valueOf(idigit);
            break;
          case 3:
            result = Z.valueOf(repr.length());
            break;
          default:
            //== System.out.println("#** assertion 1: k=" + k + ", idigit=" + idigit + ", repr=" + repr);
            break;
        } // switch 
      }
    } // while found
    //== System.out.println("#  findLeastK(seq, count=" + count + ") -> " + result);
    return result;
  } // findLeastK
  

  @Override
  public Z next() {
    Z result = null;
    ++mN;
    //== System.out.println("#--------next() = " + mN + "--------");
    switch ((mFeatures & 0xf0) >> 4) { // high nibble
      case 1: // mN^k
        result = findLeastK(new PowSeries(Z.valueOf(mN)), mCount);
        break;
      case 2: // mBase^k
        result = findLeastK(new PowSeries(Z.valueOf(mBase)), mN);
        break;
      case 3: // Fibonacci
        result = findLeastK(new A000045(), mN);
        break;
      case 4: // Lucas
        result = findLeastK(new A000032(), mN);
        break;
      default:
        //== System.out.println("#** assertion 2: features=" + mFeatures);
        break;
    } // switch mFeatures
    //== System.out.println("# result = " + result);
    return result;
  } // next

}

