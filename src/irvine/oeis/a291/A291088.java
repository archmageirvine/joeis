package irvine.oeis.a291;

import irvine.math.z.Z;
import irvine.oeis.a026.A026520;

/**
 * A291088 a(n) = A026520(2n).
 * @author Georg Fischer
 */
public class A291088 extends A026520 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
