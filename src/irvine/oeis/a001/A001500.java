package irvine.oeis.a001;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.ArrayList;

/**
 * A001500 Number of stochastic matrices of integers: <code>n X n</code> arrays of nonnegative integers with all row and column sums equal to 3.
 * @author Sean A. Irvine
 */
public class A001500 implements Sequence {

  // This whole generation is ugly and my confidence is not that great that
  // this formula works for higher terms, but it is listed as correct on
  // the corresponding OEIS page.

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final ArrayList<Polynomial<Z>> PSEQ = new ArrayList<>();
  static {
    PSEQ.add(Polynomial.create(3456, -5760, 2880));
    PSEQ.add(Polynomial.create(-6192, 21312, -26028, 14148, -3564, 324));
    PSEQ.add(Polynomial.create(-21384, 32076, -3402, -13203, 7209, -1377, 81));
    PSEQ.add(Polynomial.create(270216, -708372, 724230, -383283, 115578, -20232, 1944, -81));
    PSEQ.add(Polynomial.create(-28080, 75780, -78678, 40500, -10890, 1440, -72));
    PSEQ.add(Polynomial.create(-17330160, 50236612, -59311746, 38152096, -14927199, 3718687, -594054, 59004, -3321, 81));
    PSEQ.add(Polynomial.create(2576880, -7039116, 7642248, -4394565, 1484133, -304479, 37347, -2520, 72));
    PSEQ.add(Polynomial.create(64083600, -182126340, 209370724, -130257475, 48965728, -11643772, 1764196, -165175, 8712, -198));
    PSEQ.add(Polynomial.create(116928000, -343920960, 415021552, -275612976, 112954596, -30123576, 5330892, -621504, 45884, -1944, 36));
    PSEQ.add(Polynomial.create(315705600, -958439520, 1208298600, -849926784, 375129450, -110039130, 22034565, -3027357, 280800, -16800, 585, -9));
    PSEQ.add(Polynomial.create(-25401600, 74400480, -89275032, 58866500, -23918510, 6314385, -1104411, 127050, -9240, 385, -7));
    PSEQ.add(Polynomial.create(-39916800, 120543840, -150917976, 105258076, -45995730, 13339535, -2637558, 357423, -32670, 1925, -66, 1));
  }

  private final ArrayList<Q> mV = new ArrayList<>();

  {
    mV.add(Q.ONE);
  }

  private int mN = -1;
  private Z mF = Z.ONE;

  private Q v(final int n) {
    if (n < 0) {
      return Q.ZERO;
    }
    while (n >= mV.size()) {
      final int q = mV.size();
      Q sum = Q.ZERO;
      for (int k = 0; k < PSEQ.size(); ++k) {
        sum = sum.add(v(q - k - 1).multiply(RING.eval(PSEQ.get(k), Z.valueOf(q))));
      }
      mV.add(sum.divide(576).divide(q));
    }
    return mV.get(n);
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return v(mN).multiply(mF).toZ();
  }
}
