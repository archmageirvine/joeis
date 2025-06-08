package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A077697 a(n) = A077696(n+1)/A077696(n).
 * @author Sean A. Irvine
 */
public class A077697 extends Sequence1 {

  private Z mA;

  protected A077697(final Z start) {
    mA = start;
  }

  /** Construct the sequence. */
  public A077697() {
    this(Z.TWO);
  }

  @Override
  public Z next() {
    final int[] cnts = ZUtils.digitCounts(mA);
    Z m = mA;
    while (true) {
      m = m.add(mA);
      if (m.mod(10) != 0) {
        final int[] c = ZUtils.digitCounts(m);
        if (A077696.is(cnts, c)) {
          final Z r = m.divide(mA);
          mA = m;
          return r;
        }
      }
    }
  }
}
