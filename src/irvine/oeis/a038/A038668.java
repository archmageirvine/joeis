package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038668 <code>a(n)=[ n/3 ] + [ n/4 ] + [ n/7 ] + [ n/11 ] + [ n/18 ] + [ n/29 ] + [ n/47 ] + [ n/76 ] + [ n/123 ] + [ n/199 ]</code>... (using Lucas numbers A000204).
 * @author Sean A. Irvine
 */
public class A038668 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long a = 1;
    long b = 3;
    Z sum = Z.ZERO;
    while (b <= mN) {
      sum = sum.add(mN / b);
      final long t = a + b;
      a = b;
      b = t;
    }
    return sum;
  }

}

