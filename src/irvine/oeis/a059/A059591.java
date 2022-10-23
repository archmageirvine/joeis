package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059591 Squarefree part of n^2+1.
 * @author Sean A. Irvine
 */
public class A059591 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Jaguar.factor(Z.valueOf(++mN).square().add(1)).core();
  }
}
