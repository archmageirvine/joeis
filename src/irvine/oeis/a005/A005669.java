package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a002.A002386;

/**
 * A005669.
 * @author Sean A. Irvine
 */
public class A005669 extends A002386 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mN);
  }
}

