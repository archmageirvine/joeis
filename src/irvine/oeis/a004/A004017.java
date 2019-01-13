package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a007.A007331;

/**
 * A004017.
 * @author Sean A. Irvine
 */
public class A004017 extends A007331 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().shiftLeft(4);
  }
}
