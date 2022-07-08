package irvine.oeis.a057;

import irvine.math.z.Z;

/**
 * A057841 a(n) = 2^A057838(n) corresponding to extremal cases of A055079.
 * @author Sean A. Irvine
 */
public class A057841 extends A057838 {

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(super.next().intValueExact());
  }
}
