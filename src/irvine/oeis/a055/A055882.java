package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055882 a(n) = 2^n*Bell(n). E.g.f.: exp(exp(2x)-1).
 * @author Georg Fischer
 */
public class A055882 extends Sequence0 {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Functions.BELL.z(mN).multiply(Z.ONE.shiftLeft(mN));
  }
}
