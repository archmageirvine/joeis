package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a039.A039966;

/**
 * A081611 Number of numbers &lt;= n having no 2 in their ternary representation.
 * a(n) = a(n-1) + A039966(n).
 * @author Georg Fischer
 */
public class A081611 extends A039966 {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = mA.add(super.next());
    return mA;
  }
}
