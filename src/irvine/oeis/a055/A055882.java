package irvine.oeis.a055;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055882 a(n) = 2^n*Bell(n). E.g.f.: exp(exp(2x)-1).
 * @author Georg Fischer
 */
public class A055882 implements Sequence {

  protected int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return BellNumbers.bell(mN).multiply(Z.ONE.shiftLeft(mN));
  }
}
