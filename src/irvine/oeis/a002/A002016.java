package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000292;

/**
 * A002016.
 * @author Sean A. Irvine
 */
public class A002016 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final A000292 tetra = new A000292();
    tetra.next(); // skip 0
    long c = 0;
    final Z n = Z.valueOf(++mN);
    for (long k = 0; k < mN; ++k) {
      if (tetra.next().gcd(n).equals(Z.ONE)) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}
