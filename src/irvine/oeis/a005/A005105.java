package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A005105.
 * @author Sean A. Irvine
 */
public class A005105 extends A000040 {


  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      Z t = p.add(1).makeOdd();
      while (t.mod(3) == 0) {
        t = t.divide(3);
      }
      if (Z.ONE.equals(t)) {
        return p;
      }
    }
  }
}
