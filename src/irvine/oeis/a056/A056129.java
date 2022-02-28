package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A056129 Final nonzero digit of n-th primorial.
 * @author Georg Fischer
 */
public class A056129 extends A002110 {

  @Override
  public Z next() {
    final String primorial = super.next().toString();
    int i = primorial.length();
    while (primorial.charAt(--i) == '0') {
    }
    return Z.valueOf(primorial.charAt(i) - '0');
  }
}
