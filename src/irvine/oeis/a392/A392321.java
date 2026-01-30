package irvine.oeis.a392;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392321 Number of all 1-tuples, 2-tuples, ..., n-tuples where each entry is chosen from the nonempty subsets of {1,..,n}.
 * @author Sean A. Irvine
 */
public class A392321 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> Z.ONE.shiftLeft(mN).subtract(1).pow(k));
  }
}
