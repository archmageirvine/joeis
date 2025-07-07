package irvine.oeis.a385;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001511;

/**
 * A385507 allocated for Hugo Leeney.
 * @author Sean A. Irvine
 */
public class A385507 extends Sequence1 implements DirectSequence {

  private final DirectSequence mA001511 = new A001511();
  private long mN = 0;

  @Override
  public Z a(final Z n) {
    if (n.isEven()) {
      return mA001511.a(n.divide2());
    }
    final long r = n.and(Z.THREE).longValue();
    if (r == 3) {
      return a(n.add(1).divide(4));
    }
    return mA001511.a(n.add(3).divide(4).multiply(3).subtract(2));
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }
}

