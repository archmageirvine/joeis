package irvine.oeis.a080;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A080134.
 * @author Sean A. Irvine
 */
public class A080135 extends CachedSequence {

  /** Construct the sequence. */
  public A080135() {
    super(0);
  }

  private CR mS = CR.valueOf(new Q(22, 10));

  @Override
  protected Z compute(final Z nn) {
    final int n = nn.intValueExact();
    if (n == 0) {
      return Z.ONE;
    }
    CR s = CR.ZERO;
    for (int k = 0; k < n; ++k) {
      s = s.add(CR.valueOf(a(k)).pow(mS).inverse());
    }
    mS = s;
    return mS.multiply(a(n - 1)).floor();
  }
}

