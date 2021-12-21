package irvine.oeis.a094;

import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.oeis.ExponentialGeneratingFunction;

/**
 * A094037 Number of connected 6-element antichains on a labeled n-set.
 * E.g.f.: (exp(63*x) - 30*exp(47*x) + 120*exp(39*x) + 60*exp(35*x) + 60*exp(33*x) - 18*exp(32*x) - 339*exp(31*x) - 720*exp(29*x) + 810*exp(27*x) + 120*exp(26*x) + 480*exp(25*x) + 480*exp(24*x) - 600*exp(23*x) - 720*exp(22*x) - 240*exp(21*x) - 900*exp(20*x) + 1740*exp(19*x) + 615*exp(18*x) + 180*exp(17*x) + 435*exp(16*x) - 1445*exp(15*x) - 3270*exp(14*x) + 1710*exp(13*x) + 4620*exp(12*x) - 3360*exp(11*x) - 3210*exp(10*x) + 3360*exp(9*x) + 6810*exp(8*x) - 12465*exp(7*x) + 5985*exp(6*x) + 7110*exp(5*x) - 18555*exp(4*x) + 17884*exp(3*x) - 8352*exp(2*x) + 1764*exp(x) - 120)/720
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A094037 extends ExponentialGeneratingFunction {

  /** Construct the sequence. */
  public A094037() {
    super(0);
  }

  private static final int[][] C = {
    {0, -120},
    {1, 1764},
    {2, -8352},
    {3, 17884},
    {4, -18555},
    {5, 7110},
    {6, 5985},
    {7, -12465},
    {8, 6810},
    {9, 3360},
    {10, -3210},
    {11, -3360},
    {12, 4620},
    {13, 1710},
    {14, -3270},
    {15, -1445},
    {16, 435},
    {17, 180},
    {18, 615},
    {19, 1740},
    {20, -900},
    {21, -240},
    {22, -720},
    {23, -600},
    {24, 480},
    {25, 480},
    {26, 120},
    {27, 810},
    {29, -720},
    {31, -339},
    {32, -18},
    {33, 60},
    {35, 60},
    {39, 120},
    {47, -30},
    {63, 1},
  };
  private static final Q Q720 = new Q(720);

  @Override
  public Polynomial<Q> compute(final int n) {
    Polynomial<Q> sum = RING.zero();
    for (final int[] c : C) {
      sum = RING.add(sum, RING.multiply(RING.exp(RING.monomial(new Q(c[0]), 1), n), new Q(c[1])));
    }
    return RING.divide(sum, Q720);
  }
}
