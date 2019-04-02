package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A067570 Numbers n such that A000009(n) divides A067553(n).
 * @author Sean A. Irvine
 */
public class A067570 extends A067553 {

  private final A000009 mS = new A000009();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (Z.ZERO.equals(super.next().mod(mS.next()))) {
        return Z.valueOf(mN);
      }
    }
  }
}

