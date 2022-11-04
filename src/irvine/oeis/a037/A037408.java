package irvine.oeis.a037;
// manually, 2020-10-30

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A037408 Positive numbers having the same set of digits in base 2 and base 3.
 * Assertion: <code>base1 &lt; base2</code>.
 * @author Georg Fischer
 */
public class A037408 extends Sequence1 {

  protected Z mN;
  protected int mBase1;
  protected int mBase2;

  /** Construct the sequence. */
  public A037408() {
    this(2, 3);
  }
  
  /**
   * Constructor with parameters
   * @param base1 first base
   * @param base2 second base
   */
  protected A037408(final int base1, final int base2) {
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
