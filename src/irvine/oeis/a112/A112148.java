package irvine.oeis.a112;

import irvine.math.z.Z;
import irvine.oeis.a187.A187146;

/**
 * A112148 McKay-Thompson series of class 12B for the Monster group.
 * @author Sean A. Irvine
 */
public class A112148 extends A187146 {

  private long mN = -1;

  @Override
  public Z next() {
    final Z a = super.next();
    return ++mN == 1 ? Z.ZERO : a;
  }
}

