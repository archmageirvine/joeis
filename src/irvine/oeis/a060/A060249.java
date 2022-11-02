package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A060249 Size of the automorphism group of the symmetric group S_n.
 * @author Sean A. Irvine
 */
public class A060249 extends A000142 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    final Z f = super.next();
    if (mN == 2) {
      return Z.ONE;
    } else if (mN == 6) {
      return Z.valueOf(1440);
    } else {
      return f;
    }
  }
}
