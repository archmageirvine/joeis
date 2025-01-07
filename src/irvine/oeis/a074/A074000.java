package irvine.oeis.a074;

import irvine.math.group.GaloisField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074000 Number of elements of GF(3^n) with trace 0 and subtrace 0.
 * @author Sean A. Irvine
 */
public class A074000 extends Sequence1 {

  private int mN = 0;
  private final Z mP;
  private final Z mNegTrace;
  private final Z mSubtrace;

  protected A074000(final long p, final long trace, final long subtrace) {
    mP = Z.valueOf(p);
    mNegTrace = Z.valueOf((p - trace) % p);
    mSubtrace = Z.valueOf(subtrace);
  }

  /** Construct the sequence. */
  public A074000() {
    this(3, 0, 0);
  }

  @Override
  public Z next() {
    final GaloisField gf = new GaloisField(mP, ++mN);
    long cnt = 0;
    for (final Z a : gf) {
      final Polynomial<Z> cp = gf.characteristicPolynomial(a);
      if (cp.coeff(mN - 1).equals(mNegTrace) && cp.coeff(mN - 2).equals(mSubtrace)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
