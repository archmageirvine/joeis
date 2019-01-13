package irvine.oeis.a000;

import irvine.math.r.Bessel;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000134.
 * @author Sean A. Irvine
 */
public class A000134 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (Bessel.j(0, mN - 0.5) * Bessel.j(0, mN + 0.5) > 0);
    return Z.valueOf(mN);
  }
}
