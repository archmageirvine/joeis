package irvine.oeis.a037;
// manually, 2020-10-30

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A037337 n-th number k such that no base 9 digit of k is a base 10 digit of k.
 * The set of base1 digits must be disjoint from the set of the base 2 digits.
 * Assertion: <code>base1 &lt; base2</code>.
 * @author Georg Fischer
 */
public class A037337 implements Sequence {

  protected Z mN;
  protected int mBase1;
  protected int mBase2;

  /** Construct the sequence. */
  public A037337() {
    this(9, 10);
  }
  
  /**
   * Constructor with parameters
   * @param base modulo base
   * @param incr additive term
   */
  protected A037337(final int base1, final int base2) {
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
      boolean disjoint = true;
      while (disjoint && k >= 0) { // all base1 digits
        if (set1[k] > 0) {
          disjoint = set2[k] == 0;
        }
        --k;
      }
      busy = ! disjoint;
    }
    return mN;
  }
}
