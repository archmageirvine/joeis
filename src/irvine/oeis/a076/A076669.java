package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a053.A053191;

/**
 * A076585.
 * @author Sean A. Irvine
 */
public class A076669 extends A053191 {

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next().add(1);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
