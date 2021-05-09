package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a007.A007415;

/**
 * A046979 Denominators of Taylor series for exp(x)*sin(x).
 * @author Sean A. Irvine
 */
public class A046979 extends A007415 {

  @Override
  public Z next() {
    return super.next().abs().max(Z.ONE);
  }
}
