package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a169.A169985;

/**
 * A038669 [ n/2 ]+[ n/3 ]+[ n/4 ]+[ n/7 ]+[ n/11 ]+[ n/18 ]+[ n/29 ]+[ n/47 ]+[ n/76 ]+[ n/123 ]+[ n/199 ]+... (using Lucas numbers A000032).
 * @author Sean A. Irvine
 */
public class A038669 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    final Sequence f = new A169985();
    f.next(); // skip 1
    long t;
    while ((t = mN / f.next().longValueExact()) != 0) {
      sum += t;
    }
    return Z.valueOf(sum);
  }
}
