package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A003401 Numbers of edges of regular polygons constructible with ruler <code>(or</code>, more precisely, an unmarked straightedge) and compass.
 * @author Sean A. Irvine
 */
public class A003401 extends A000010 {

  @Override
  public Z next() {
    while (true) {
      if (super.next().bitCount() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
