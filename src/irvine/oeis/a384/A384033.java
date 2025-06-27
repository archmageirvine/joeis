package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000607;

/**
 * A384033 allocated for Michael Terhoeven.
 * @author Sean A. Irvine
 */
public class A384033 extends Sequence1 {

  private long mN = 0;
  private final DirectSequence mA = DirectSequence.create(new A000607());

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    // We want to solve n = sopfr(k*sopfr(n))
    // Note sopfr(a*b) = sopfr(a)+sopfr(b)
    final long sopfr = Functions.SOPFR.l(mN);
    final long ss = Functions.SOPFR.l(sopfr);
    if (ss >= mN) {
      return ss == mN ? Z.ONE : Z.ZERO;
    }
    return mA.a((int) (mN - ss));
  }
}

