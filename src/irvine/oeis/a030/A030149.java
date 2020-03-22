package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a029.A029951;

/**
 * A030149 Even palindromes in which parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030149 extends A029951 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (A030141.isOk(p)) {
        return p;
      }
    }
  }
}
