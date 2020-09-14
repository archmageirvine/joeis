package irvine.oeis.a107;

import irvine.math.z.Z;
import irvine.oeis.a007.A007246;

/**
 * A107080 McKay-Thompson series of class 4A for the Monster group.
 * @author Sean A. Irvine
 */
public class A107080 extends A007246 {

  @Override
  public Z next() {
    return super.next().abs();
  }
}

