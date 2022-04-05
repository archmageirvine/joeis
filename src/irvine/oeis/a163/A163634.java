package irvine.oeis.a163;

import irvine.math.z.Z;
import irvine.oeis.a143.A143206;

/**
 * A163634 a(n) = (p*(p+4)+1)/2 where (p,p+4) are the n-th cousin prime pair.
 * a(n) = (A143206(n) + 1)/2.
 * @author Georg Fischer
 */
public class A163634 extends A143206 {

  @Override
  public Z next() {
    return super.next().add(1).divide2();
  }
}
