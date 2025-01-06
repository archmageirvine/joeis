package irvine.oeis.a074;

import irvine.math.group.GaloisField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001037.
 * @author Sean A. Irvine
 */
public class A074000 extends Sequence1 {

  private int mN = 0;
  private final Z mNegTrace;
  private final Z mSubtrace;

  protected A074000(final long trace, final long subtrace) {
    mNegTrace = Z.valueOf((3 - trace) % 3);
    mSubtrace = Z.valueOf(subtrace);
  }

  /** Construct the sequence. */
  public A074000() {
    this(0, 0);
  }

  @Override
  public Z next() {
    final GaloisField gf = new GaloisField(Z.THREE, ++mN);
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
