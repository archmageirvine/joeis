package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061228 a(1) = 2, a(n) = smallest number greater than n which is not coprime to n.
 * @author Sean A. Irvine
 */
public class A061228 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return ++mN == 1 ? Z.TWO : Jaguar.factor(mN).divisorsSorted()[1].add(mN);
  }
}
