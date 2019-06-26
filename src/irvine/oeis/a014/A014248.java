package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a110.A110117;
import irvine.oeis.a110.A110118;

/**
 * A014248 <code>a(n) = b(n) - c(n)</code> where <code>b(n) = [ n*(sqrt(2)+sqrt(3)) ]</code> and <code>c(n)</code> is the n-th number not in sequence <code>b( )</code>.
 * @author Sean A. Irvine
 */
public class A014248 extends A110117 {

  private final A110118 mA = new A110118();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
