package irvine.oeis.a097;

import irvine.math.z.Z;
import irvine.oeis.a007.A007191;

/**
 * A097340 McKay-Thompson series of class 4A for the Monster group with <code>a(0) = 24</code>.
 * @author Sean A. Irvine
 */
public class A097340 extends A007191 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.valueOf(24) : a.abs();
  }
}

