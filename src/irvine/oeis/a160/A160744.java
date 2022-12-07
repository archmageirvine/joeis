package irvine.oeis.a160;

import irvine.math.z.Z;
import irvine.oeis.a151.A151566;

/**
 * A160744 a(n) = A151566(n)*3.
 * @author Georg Fischer
 */
public class A160744 extends A151566 {

  @Override
  public Z next() {
    return super.next().multiply(3);
  }
}
