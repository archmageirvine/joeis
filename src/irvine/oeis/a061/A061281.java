package irvine.oeis.a061;

import java.util.Arrays;

import irvine.math.r.Constants;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A061281.
 * @author Sean A. Irvine
 */
public class A061281 extends Sequence1 {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final long[] mA = {1, 1, 1, 112};

  private void bump() {
    for (int k = 0; k < mA.length - 1; ++k) {
      if (++mA[k] <= mA[k + 1]) {
        return;
      }
      //mA[k] = 1;
      mA[k] = mA[mA.length - 1] - mA[k]; // We require a+b > d, etc.
    }
    if (++mA[mA.length - 1] > 38900) {
      throw new UnsupportedOperationException(); // overflow danger
    }
  }

  protected Z select(final long[] abcd) {
    if (mVerbose) {
      StringUtils.message(Arrays.toString(abcd));
    }
    return Z.valueOf(abcd[3]);
  }

  @Override
  public Z next() {
    while (true) {
      bump();
      // Following conditions eliminate points on the edge of the triangle
      if (mA[0] + mA[1] > mA[3] && mA[0] + mA[2] > mA[3] && mA[1] + mA[2] > mA[3]) {
        final long a2 = mA[0] * mA[0];
        final long b2 = mA[1] * mA[1];
        final long c2 = mA[2] * mA[2];
        final long d2 = mA[3] * mA[3];
        final long s2 = a2 + b2 + c2 + d2;
        if (s2 * s2 == 3 * (a2 * a2 + b2 * b2 + c2 * c2 + d2 * d2)) {
          // Most of the time when we get here, the point (a,b,c,d) is a solution, but
          // there appear to be a few cases where the point is outside the triangle.
          // Therefore, we check that the point is internal by checking angles.
          final double alpha = Math.acos((a2 + b2 - d2) / (2.0 * mA[0] * mA[1]));
          final double beta = Math.acos((a2 + c2 - d2) / (2.0 * mA[0] * mA[2]));
          final double gamma = Math.acos((b2 + c2 - d2) / (2.0 * mA[1] * mA[2]));
          //System.out.println("angles:" + DoubleUtils.NF4.format((alpha + beta + gamma) * 180.0 / Math.PI));
          if (Math.abs(alpha + beta + gamma - Constants.TAU) < 0.001) {
            return select(mA);
          }
        }
      }
    }
  }
}
