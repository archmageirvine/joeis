package irvine.oeis.a000;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000521 Coefficients of modular function j as power series in q = e^(2 Pi i t). Another name is the elliptic modular invariant J(tau).
 * @author Sean A. Irvine
 */
public class A000521 extends AbstractSequence {

  /** Construct the sequence. */
  public A000521() {
    super(-1);
  }

  private final ArrayList<Z> mA = new ArrayList<>();
  protected int mN = -2;

  {
    mA.add(Z.ONE);                     // -1
    mA.add(Z.valueOf(744));            // 0
    mA.add(Z.valueOf(196884));         // 1
    mA.add(Z.valueOf(21493760));       // 2
    mA.add(Z.valueOf(864299970));      // 3
    mA.add(Z.valueOf(20245856256L));   // 4
    mA.add(Z.valueOf(333202640600L));  // 5
  }

  private Z c(final int n) {
    return mA.get(n + 1);
  }

  @Override
  public Z next() {
    // Using approach due to Mahler, more efficient approaches are known
    if (++mN + 1 >= mA.size()) {
      final int n = mN / 4;
      Z sum;
      switch (mN & 3) {
      case 0:
        final Z cn = c(n);
        sum = c(2 * n + 1).add(cn.square().subtract(cn).divide2());
        for (int k = 1; k < n; ++k) {
          sum = sum.add(c(k).multiply(c(2 * n - k)));
        }
        break;
      case 1:
        sum = c(2 * n + 3).subtract(c(2).multiply(c(2 * n)))
          .add(c(n + 1).square().subtract(c(n + 1)).divide2())
          .add(c(2 * n).square().add(c(2 * n)).divide2());
        for (int k = 1; k <= n; ++k) {
          sum = sum.add(c(k).multiply(c(2 * n - k + 2)));
        }
        for (int k = 1; k < 2 * n; ++k) {
          final Z t = c(k).multiply(c(4 * n - k));
          sum = sum.signedAdd((k & 1) == 0, t);
        }
        for (int k = 1; k < n; ++k) {
          sum = sum.add(c(k).multiply(c(4 * n - 4 * k)));
        }
        break;
      case 2:
        sum = c(2 * n + 2);
        for (int k = 1; k <= n; ++k) {
          sum = sum.add(c(k).multiply(c(2 * n - k + 1)));
        }
        break;
      default:
        sum = c(2 * n + 4).subtract(c(2).multiply(c(2 * n + 1)))
          .subtract(c(2 * n + 1).square().subtract(c(2 * n + 1)).divide2());
        for (int k = 1; k <= n + 1; ++k) {
          sum = sum.add(c(k).multiply(c(2 * n - k + 3)));
        }
        for (int k = 1; k <= 2 * n; ++k) {
          final Z t = c(k).multiply(c(4 * n - k + 2));
          sum = sum.signedAdd((k & 1) == 0, t);
        }
        for (int k = 1; k <= n; ++k) {
          sum = sum.add(c(k).multiply(c(4 * n - 4 * k + 2)));
        }
        break;
      }
      mA.add(sum);
    }
    return c(mN);
  }
}
