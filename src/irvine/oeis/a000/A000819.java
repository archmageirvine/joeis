package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000819.
 * @author Sean A. Irvine
 */
public class A000819 extends A000816 {

  @Override
  public Z next() {
    final Z t = super.next();
    return Z.ZERO.equals(t) ? Z.ONE : t;
  }
}
