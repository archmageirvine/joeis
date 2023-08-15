package irvine.oeis.a331;

import irvine.math.z.Z;
import irvine.oeis.a115.A115005;

/**
 * A331771 a(n) = Sum_{-n&lt;i&lt;n, -n&lt;j&lt;n, gcd{i,j}=1} (n-|i|)*(n-|j|).
 * @author Georg Fischer
 */
public class A331771 extends A115005 {

  @Override
  public Z next() {
    return super.next().multiply(4);
  }
}
