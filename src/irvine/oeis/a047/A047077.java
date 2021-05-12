package irvine.oeis.a047;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000328;
import irvine.oeis.a051.A051132;

/**
 * A047077 Number of pairs of integers (x,y) with n^2 &lt;= x^2+y^2 &lt;= (n+1)^2.
 * @author Sean A. Irvine
 */
public class A047077 extends A000328 {

  {
    super.next();
  }
  private final Sequence mA = new A051132();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
