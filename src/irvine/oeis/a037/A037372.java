package irvine.oeis.a037;
// manually, 2020-10-30

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A037372 Positive numbers k such that every base-2 digit of k is a base-3 digit of k.
 * The set of base 1 digits must be a subset of the base 2 digits.
 * Assertion: <code>base1 &lt; base2</code>.
 * @author Georg Fischer
 */
public class A037372 extends Sequence1 {

  protected Z mN;
  protected int mBase1;
  protected int mBase2;

  /** Construct the sequence. */
  public A037372() {
    this(2, 3);
  }
  
  /**
   * Constructor with parameters
   * @param base1 modulo base
   * @param base2 additive term
   */
  protected A037372(final int base1, final int base2) {
    assert base1 < base2;
    mN = Z.ZERO;
    mBase1 = base1;
    mBase2 = base2;
  }

  @Override
  public Z next() {
    boolean busy = true;
    while (busy) {
      mN = mN.add(Z.ONE);
      final int[] set1 = ZUtils.digitCounts(mN, mBase1);
      final int[] set2 = ZUtils.digitCounts(mN, mBase2);
      int k = set1.length - 1; 
      boolean contained = true;
      while (contained && k >= 0) { // all base1 digits
        if (set1[k] > 0) {
          contained = set2[k] > 0;
        }
        --k;
      }
      busy = ! contained;
    }
    return mN;
  }
}
