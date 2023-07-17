package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.a000.A000009;

/**
 * A067570 Numbers n such that A000009(n) divides A067553(n).
 * @author Sean A. Irvine
 */
public class A067570 extends A067553 {

  /** Construct the sequence. */
  public A067570() {
    super(1);
  }

  private final A000009 mS = new A000009();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().mod(mS.next()).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}

