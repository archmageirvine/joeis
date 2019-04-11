package irvine.oeis.a094;

import irvine.math.z.Z;
import irvine.oeis.a057.A057561;

/**
 * A094708 Size of the smallest set hitting all <code>{x, 2x, 3x}</code> contained in D(n) = the first n 3-smooth numbers <code>{1, 2, 3, 4, 6, 8, 9, 12, 16, 18, 24, 27,...}</code> (A003586).
 * @author Sean A. Irvine
 */
public class A094708 extends A057561 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(super.next());
  }
}
