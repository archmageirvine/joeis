package irvine.oeis.a004;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A004204.
 * @author Sean A. Irvine
 */
public class A004204 extends AbstractSequence {

  private final int mSpread;
  private int mN;

  protected A004204(final int spread) {
    super(spread + 1);
    mSpread = spread;
    mN = spread;
  }

  /** Construct the sequence. */
  public A004204() {
    this(0);
  }

  @Override
  public Z next() {
    ++mN;
    final Z[][] cnts = new Z[1 << mN][mN];
    for (final Z[] t : cnts) {
      Arrays.fill(t, Z.ZERO);
    }
    cnts[0][0] = Z.ONE;
    for (int i = 0; i + 1 < (1 << mN); ++i) {
      final int coef = Integer.bitCount(i);
      for (int j = 0; j < mN; ++j) {
        if (((i >>> j) & 1) == 0) {
          final int add = (coef * j) % mN;
          for (int k = 0; k < mN - add; ++k) {
            final int u = i | (1 << j);
            final int v = k + add;
            cnts[u][v] = cnts[u][v].add(cnts[i][k]);
          }
          for (int k = mN - add; k < mN; ++k) {
            final int u = i | (1 << j);
            final int v = k + add - mN;
            cnts[u][v] = cnts[u][v].add(cnts[i][k]);
          }
        }
      }
    }
    return cnts[cnts.length - 1][mSpread];
  }
}

