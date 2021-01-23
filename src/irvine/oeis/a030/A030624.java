package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000455;

/**
 * A030624 Powers of 2 grouped in pairs of 2 digits (version 3).
 * @author Sean A. Irvine
 */
public class A030624 extends A000455 {

  @Override
  public Z next() {
    Z t = Z.ZERO;
    do {
      t = t.multiply(10).add(super.next());
    } while (t.compareTo(Z.TEN) < 0);
    return t;
  }
}

