package irvine.oeis.a291;

import irvine.math.z.Z;
import irvine.oeis.a026.A026520;

/**
 * A291089 a(n) = A026520(2n+1).
 * @author Georg Fischer
 */
public class A291089 extends A026520 {

  @Override
  public Z next() {
    super.next();
    return super.next();
  }
}
