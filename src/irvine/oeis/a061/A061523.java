package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a025.A025587;

/**
 * A061523 Integer part of the blowup factor for A025587(n).
 * @author Sean A. Irvine
 */
public class A061523 extends A025587 {

  @Override
  public Z next() {
    super.next();
    return mMax.toZ();
  }
}

