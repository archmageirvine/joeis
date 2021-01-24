package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A038663 [ n/F_2 ] + [ n/F_3 ] + [ n/F_4 ] +..., F_n=Fibonacci numbers.
 * @author Sean A. Irvine
 */
public class A038663 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long sum = 0;
    final Sequence f = new A000045();
    f.next(); // skip 0
    f.next(); // skip first 1
    long t;
    while ((t = mN / f.next().longValueExact()) != 0) {
      sum += t;
    }
    return Z.valueOf(sum);
  }
}
