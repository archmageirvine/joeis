package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.a030.A030183;

/**
 * A045489 McKay-Thompson series of class 7A for the Monster group with a(0) = 3.
 * @author Sean A. Irvine
 */
public class A045489 extends A030183 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.THREE : a;
  }
}

