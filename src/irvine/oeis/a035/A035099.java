package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a007.A007191;

/**
 * A035099 McKay-Thompson series of class 2B for the Monster group with a(0) = 40.
 * @author Sean A. Irvine
 */
public class A035099 extends A007191 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.valueOf(40) : a;
  }
}

