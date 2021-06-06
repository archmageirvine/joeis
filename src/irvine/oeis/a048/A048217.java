package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a004.A004979;

/**
 * A048217 a(n)=T(n+1,n), array T given by A048212.
 * @author Sean A. Irvine
 */
public class A048217 extends A004979 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(3);
  }
}
