package irvine.oeis.a085;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.triangle.Triangle;

/**
 * A085467 Numerators of coefficients of e^2 in the table of (2n)th du Bois Reymond constants.
 * @author Sean A. Irvine
 */
public class A085467 extends Triangle {

  private static final Q NEG3 = Q.valueOf(-3);
  private int mN = 0;
  private int mM = 0;
  protected Z mLcm = Z.ONE;
  private final ArrayList<Z> mRow = new ArrayList<>();
  {
    mRow.add(Z.ZERO);
  }

  protected A085467(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A085467() {
    this(0);
  }

  protected void buildRow(final int m) {
    final Q[] coeffs = new Q[m + 1];

    // constant term
    coeffs[0] = NEG3.subtract(new Q(Functions.FACTORIAL.z(2 * m - 2), Z.ONE.shiftLeft(2L * m - 1).multiply(Functions.FACTORIAL.z(m)).multiply(Functions.FACTORIAL.z(m - 1))));

    final Z pow2 = Z.ONE.shiftLeft(2L * m - 1);
    for (int r = 1; r <= m; ++r) {
      Q sum = Q.ZERO;
      for (int s = 0; s <= m - r; ++s) {
        final Z fourr = Z.valueOf(4L * r).pow(s);
        final Z den = Functions.FACTORIAL.z(s).multiply(Functions.FACTORIAL.z(m - r - s));

        final Q t1 = new Q(Functions.FACTORIAL.z(2 * m - s), Functions.FACTORIAL.z(m + r));
        final Q t2 = new Q(Functions.FACTORIAL.z(2 * m - s - 1), Functions.FACTORIAL.z(m + r - 1));
        final Q t3 = new Q(Functions.FACTORIAL.z(2 * m - s - 2), Functions.FACTORIAL.z(m + r - 2));
        final Q term = t1.subtract(t2.multiply(4)).add(t3.multiply(4)).multiply(new Q((s & 1) == 0 ? fourr : fourr.negate(), den));
        sum = sum.add(term);
      }
      coeffs[r] = sum.divide(pow2);
    }

    // coefficient denominators
    mLcm = Z.ONE;
    for (final Q c : coeffs) {
      mLcm = mLcm.lcm(c.den());
    }
    mRow.clear();
    // output highest power first
    for (int r = m; r >= 0; --r) {
      mRow.add(coeffs[r].multiply(mLcm).toZ());
    }
  }

  @Override
  public Z next() {
    if (mM >= mRow.size()) {
      buildRow(++mN);
      mM = 0;
    }
    return mRow.get(mM++);
  }
}
