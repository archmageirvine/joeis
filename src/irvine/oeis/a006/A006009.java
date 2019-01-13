package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a007.A007009;

/**
 * A006009.
 * @author Sean A. Irvine
 */
public class A006009 extends A007009 {

  @Override
  public Z next() {
    return super.next().shiftLeft(2);
  }
}

