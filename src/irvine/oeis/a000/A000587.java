package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000587 Rao Uppuluri-Carpenter numbers (or complementary Bell numbers): e.g.f. = exp(1 - exp(x)).
 * @author Sean A. Irvine
 */
public class A000587 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      s = s.signedAdd((k & 1) == 0, Stirling.secondKind(mN, k));
    }
    return s;
  }
}

