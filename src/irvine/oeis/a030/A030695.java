package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a000.A000578;

/**
 * A030695 Smallest nontrivial extension of n-th cube which is a cube.
 * @author Sean A. Irvine
 */
public class A030695 extends A000578 {

  /** Construct the sequence. */
  public A030695() {
    super(1);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    Z t = super.next().multiply(10);
    long lim = 10;
    long v = -1;
    while (true) {
      if (++v >= lim) {
        lim *= 10;
        t = t.multiply(10);
        v = 0; // to allow for leading 0s in what is appended
      }
      final Z u = t.add(v);
      if (ZUtils.isCube(u)) {
        return u;
      }
    }
  }
}

