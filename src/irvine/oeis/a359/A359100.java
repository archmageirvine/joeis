package irvine.oeis.a359;
// Generated by gen_seq4.pl multm/simple1 at 2023-03-28 18:24

import irvine.factor.factor.Jaguar;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A359100 a(n) = (1/4) * Sum_{d|n} phi(5 * d).
 * @author Georg Fischer
 */
public class A359100 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Jaguar.factor(5L * d).phi()).divide(4);
  }
}
