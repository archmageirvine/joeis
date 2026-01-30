package irvine.oeis.a391;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a067.A067274;

/**
 * A391597 a(n) is the number of quadratic polynomials with coefficients in {-n, ..., n}, positive leading coefficient, and having two integer roots.
 * @author Sean A. Irvine
 */
public class A391597 extends Sequence1 {

  private final DirectSequence mA = DirectSequence.forceCreate(0, new A067274());
  private int mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sum(1, ++mN, k -> mA.a(mN / k));
  }
}
