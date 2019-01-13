package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A005235.
 * @author Sean A. Irvine
 */
public class A005235 extends A002110 {

  {
    super.next();
  }

  @Override
  public Z next() {
    final Z pp = super.next();
    Z m = Z.ONE;
    while (true) {
      m = m.add(2);
      if (pp.add(m).isProbablePrime()) {
        return m;
      }
    }
  }
}
