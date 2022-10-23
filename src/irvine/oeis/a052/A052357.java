package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a031.A031934;

/**
 * A052357 First prime from A031934 (lesser of 16-twins) whose distance to the next 16-twin increases.
 * @author Sean A. Irvine
 */
public class A052357 extends Sequence1 {

  private long mN = 12;

  @Override
  public Z next() {
    mN += 6;
    final Sequence seq = new A031934();
    Z p = seq.next();
    while (true) {
      final Z q = p;
      p = seq.next();
      if (p.subtract(q).longValueExact() == mN) {
        return q;
      }
    }
  }
}
