package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A073685 Group the composite numbers so that the sum of each group is a prime, sequence gives number of terms in each group.
 * @author Sean A. Irvine
 */
public class A073685 extends A002808 {

  @Override
  public Z next() {
    long cnt = 1;
    Z sum = super.next();
    do {
      sum = sum.add(super.next());
      ++cnt;
    } while (!sum.isProbablePrime());
    return Z.valueOf(cnt);
  }
}
