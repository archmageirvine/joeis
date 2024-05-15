package irvine.oeis.a069;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;

/**
 * A069692.
 * @author Sean A. Irvine
 */
public class A069703 extends Sequence1 {

  private Z mN = Z.ZERO;
  private final Sequence mSeq = new A000142().skip();

  @Override
  public Z next() {
    final Z f = mSeq.next();
    mN = mN.add(1);
    Z m = mN;
    Z t = m;
    while (m.compareTo(f) < 0) {
      t = m;
      m = m.multiply(mN);
    }
    return f.subtract(t);
  }
}
