package irvine.oeis.a392;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392322 Number of coverings of [n] by 1-tuples, 2-tuples, ..., n-tuples where each entry is chosen from the subsets of [n].
 * @author Sean A. Irvine
 */
public class A392322 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> Z.ONE.shiftLeft(k).subtract(1).pow(mN));
  }
}
