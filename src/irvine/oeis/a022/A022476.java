package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a006.A006711;

/**
 * A022476 Length of n-th term of <code>A006711</code>.
 * @author Sean A. Irvine
 */
public class A022476 extends A006711 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().toString().length());
  }
}
