package irvine.oeis.a059;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A059592 Square-full part of n^2 + 1.
 * @author Sean A. Irvine
 */
public class A059592 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN).square().add(1);
    return n.divide(Functions.CORE.z(n)).sqrt();
  }
}
