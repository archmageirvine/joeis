package irvine.oeis.a004;

import irvine.math.z.Z;

/**
 * A004051.
 * @author Sean A. Irvine
 */
public class A004051 extends A004050 {

  @Override
  public Z next() {
    while (true) {
      final Z v = super.next();
      if (v.isProbablePrime()) {
        return v;
      }
    }
  }
}
