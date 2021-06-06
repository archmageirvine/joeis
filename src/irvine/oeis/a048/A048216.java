package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a004.A004979;

/**
 * A048216 a(n) = T(n,n), where array T is given by A048212.
 * @author Sean A. Irvine
 */
public class A048216 extends A004979 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
