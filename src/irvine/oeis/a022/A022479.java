package irvine.oeis.a022;

import irvine.math.z.Z;
import irvine.oeis.a006.A006711;

/**
 * A022479.
 * @author Sean A. Irvine
 */
public class A022479 extends A006711 {

  @Override
  public Z next() {
    return Z.valueOf(A022477.count(super.next(), Z.THREE));
  }
}
