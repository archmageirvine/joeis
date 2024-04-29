package irvine.oeis.a193;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A193274 a(n) = binomial(Bell(n), 2) where B(n) = Bell numbers A000110(n).
 * @author Georg Fischer
 */
public class A193274 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Binomial.binomial(Functions.BELL.z(mN), Z.TWO);
  }
}
