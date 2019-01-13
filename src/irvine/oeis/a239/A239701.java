package irvine.oeis.a239;

import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A239701.
 * @author Sean A. Irvine
 */
public class A239701 extends A000009 {

  @Override
  public Z next() {
    final Z pn = super.next();
    long k = 0;
    while (true) {
      if (pn.add(++k).isProbablePrime()) {
        return Z.valueOf(k);
      }
    }
  }
}
