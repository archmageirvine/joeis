package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a029.A029950;

/**
 * A030148 Odd palindromes in which parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030148 extends A029950 {

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
