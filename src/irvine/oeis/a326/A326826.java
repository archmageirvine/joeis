package irvine.oeis.a326;
// manually sumdiv3/sumdiv at 2023-04-11 09:59

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A326826 a(n) = (1/2) * Sum_{d|n} (sigma_1(d) + sigma_2(d)), where sigma_1 = A000203 and sigma_2 = A001157.
 * @author Georg Fischer
 */
public class A326826 extends AbstractSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A326826() {
    super(1);
  }

  @Override
  public Z next() {
    ++mN;
    return Integers.SINGLETON.sumdiv(mN, d -> Functions.SIGMA.z(d).add(Jaguar.factor(d).sigma(2))).divide2();
  }
}
