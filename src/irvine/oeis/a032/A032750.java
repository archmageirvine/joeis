package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A032750 Palindromic <code>Super-2</code> Numbers.
 * @author Sean A. Irvine
 */
public class A032750 extends A002113 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.square().multiply2().toString().contains("22")) {
        return p;
      }
    }
  }
}
