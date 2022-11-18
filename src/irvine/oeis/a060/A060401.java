package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a003.A003418;

/**
 * A060393.
 * @author Sean A. Irvine
 */
public class A060401 extends A003418 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}

