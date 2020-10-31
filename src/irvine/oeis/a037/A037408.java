package irvine.oeis.a037;
// manually, 2020-10-30

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A037408 Numbers n such that the set of base-2 digits of n equals the set of base-3 digits of n.
 * Assertion: base1 < base2.
 * @author Georg Fischer
 */
public class A037408 implements Sequence {

  protected Z mN;
  protected int mBase1;
  protected int mBase2;

  /** Construct the sequence. */
  public A037408() {
    this(2, 3);
  }
  
  /**
   * Constructor with parameters
   * @param base modulo base
   * @param incr additive term
   */
  protected A037408(final int base1, final int base2) {
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
      int k = set2.length - 1; 
      boolean contained = true;
      while (contained && k >= 0) {
        if (k >= set1.length) {
          contained = set2[k] == 0; // digits not in set1 must have zero counts
        } else {
          contained = set1[k] == 0 && set2[k] == 0 || set1[k] > 0 && set2[k] > 0;
        }
        --k;
      }
      busy = ! contained;
    }
    return mN;
  }
}
