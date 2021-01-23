package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.a000.A000670;

/**
 * A032262 Number of ways to partition n labeled elements into pie slices allowing the pie to be turned over.
 * @author Sean A. Irvine
 */
public class A032262 extends A000670 {

  private int mN = -3;

  @Override
  public Z next() {
    return ++mN == -2 ? Z.ONE : super.next().add(Z.ONE.shiftLeft(mN));
  }
}
