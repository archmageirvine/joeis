package irvine.oeis.a085;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085942 Write digit reversal of n below n. Then a(n) = the sum of the product of digits in the same column.
 * @author Sean A. Irvine
 */
public class A085942 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long r = Functions.REVERSE.l(++mN);
    long f = mN;
    long s = 0;
    while (f != 0) {
      s += (f % 10) * (r % 10);
      f /= 10;
      r /= 10;
    }
    return Z.valueOf(s);
  }
}
