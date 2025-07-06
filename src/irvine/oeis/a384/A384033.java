package irvine.oeis.a384;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000607;

/**
 * A384033 a(n) is the number of solutions to n = sopfr(k*sopfr(n)) where sopfr(m) is sum of prime factors of m counted with multiplicity.
 * @author Sean A. Irvine
 */
public class A384033 extends Sequence1 {

  private int mN = 0;
  private final DirectSequence mA = DirectSequence.create(new A000607());

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    // We want to solve n = sopfr(k*sopfr(n))
    // Note sopfr(a*b) = sopfr(a)+sopfr(b)
    final long sopfr = Functions.SOPFR.l(mN);
    final int ss = Functions.SOPFR.i(sopfr);
    if (ss >= mN) {
      return ss == mN ? Z.ONE : Z.ZERO;
    }
    return mA.a(mN - ss);
  }
}

