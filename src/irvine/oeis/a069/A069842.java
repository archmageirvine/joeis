package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069842 Number of distinct primes obtained by inserting a 1 at all possible places in n. This includes prefixing and suffixing.
 * @author Georg Fischer
 */
public class A069842 extends Sequence1 {

  private long mN = 0;
  private String mDigit;
  private TreeSet<Z> mSet = new TreeSet<Z>();

  /** Construct the sequence. */
  public A069842() {
    this(1);
  }

  /**
   * Generic constructor with parameter.
   * @param digit the digit to be inserted
   */
  public A069842(final int digit) {
    mDigit = String.valueOf(digit);
  }

  @Override
  public Z next() {
    final String nstr = String.valueOf(++mN);
    final int len = nstr.length();
    mSet.clear();
    Z cand = new Z(mDigit + nstr);
    if (cand.isProbablePrime()) {
      mSet.add(cand);
    }
    for (int pos = 0; pos <= len; ++pos) {
      cand = new Z(nstr.substring(0, pos) + mDigit + nstr.substring(pos));
      if (cand.isProbablePrime()) {
        mSet.add(cand);
      }
    }
    return Z.valueOf(mSet.size());
  }
}
