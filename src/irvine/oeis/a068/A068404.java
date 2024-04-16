package irvine.oeis.a068;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068404 Numbers k such that sigma(k) &gt; 4*k.
 * @author Sean A. Irvine
 */
public class A068404 extends Sequence1 {

  private long mN = 27719;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(++mN).compareTo(4 * mN) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
