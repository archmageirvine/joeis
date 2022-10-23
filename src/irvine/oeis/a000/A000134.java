package irvine.oeis.a000;

import irvine.math.r.Bessel;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000134 Positive zeros of Bessel function of order 0 rounded to nearest integer.
 * @author Sean A. Irvine
 */
public class A000134 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (Bessel.j(0, mN - 0.5) * Bessel.j(0, mN + 0.5) > 0);
    return Z.valueOf(mN);
  }
}
