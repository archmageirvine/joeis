package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.a014.A014486;

/**
 * A057514 Number of peaks in mountain ranges encoded by A014486, number of leaves in the corresponding rooted plane trees (the root node is never counted as a leaf).
 * @author Sean A. Irvine
 */
public class A057514 extends A014486 {

  @Override
  public Z next() {
    Z n = super.next();
    if (n.isZero()) {
      return Z.ZERO;
    }
    long r = 1;
    Z m = n.divide2();
    long c = n.mod(2);
    while (!m.isZero()) {
      if (m.mod(2) != c) {
        ++r;
        c = 1 - c;
      }
      m = m.divide2();
    }
    return Z.valueOf(r / 2);
  }
}
