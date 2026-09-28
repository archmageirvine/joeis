package irvine.oeis.a284;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A284797 Write in base k, complement, reverse. Case k = 3.
 * @author Sean A. Irvine
 */
public class A284797 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    long r = 0;
    do {
      r *= 3;
      r += 2 - m % 3;
      m /= 3;
    } while (m != 0);
    return Z.valueOf(r);
  }
}
