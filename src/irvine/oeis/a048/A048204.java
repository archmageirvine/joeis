package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a004.A004978;

/**
 * A048204 a(n)=T(n+1,n), array T given by A048201.
 * @author Sean A. Irvine
 */
public class A048204 extends A004978 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
