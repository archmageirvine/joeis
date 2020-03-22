package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a002.A002113;

/**
 * A030147 Palindromes in which parity of digits alternates.
 * @author Sean A. Irvine
 */
public class A030147 extends A002113 {

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
