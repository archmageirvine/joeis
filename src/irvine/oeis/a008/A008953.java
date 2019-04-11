package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A008953 <code>a(n)</code> is the leading digit of the n-th triangular number, <code>n(n+1)/2</code>.
 * @author Sean A. Irvine
 */
public class A008953 extends A000217 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().charAt(0) - '0');
  }
}
