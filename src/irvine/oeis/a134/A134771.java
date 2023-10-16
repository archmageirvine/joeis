package irvine.oeis.a134;

import irvine.math.z.Z;

/**
 * A134771 A134770 interleaved with threes.
 * @author Georg Fischer
 */
public class A134771 extends A134770 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 1) ? Z.THREE : super.next();
  }
}
