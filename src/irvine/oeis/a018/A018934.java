package irvine.oeis.a018;

import irvine.math.z.Z;
import irvine.oeis.a055.A055790;

/**
 * A018934 From the game of Mousetrap.
 * @author Sean A. Irvine
 */
public class A018934 extends A055790 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN < 2 ? Z.ZERO : super.next().multiply(mN - 2);
  }
}

