package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.a000.A000364;

/**
 * A013525 E.g.f.: <code>x +</code> (gdinv <code>x -</code> sinh <code>x)/2</code>, where gdinv <code>= inverse-Gudermannian</code>. Sequence has odd-indexed coefficients; others are zero.
 * @author Sean A. Irvine
 */
public class A013525 extends A000364 {

  @Override
  public Z next() {
    return super.next().subtract(mN == 0 ? -1 : 1).divide2();
  }
}
