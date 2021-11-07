package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a031.A031930;

/**
 * A052355 First prime from A031930 (=lesser of 12-twins) with increasing distance to the next 12-twin.
 * @author Sean A. Irvine
 */
public class A052355 implements Sequence {

  private long mN = 10;

  @Override
  public Z next() {
    mN += 2;
    final Sequence seq = new A031930();
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
