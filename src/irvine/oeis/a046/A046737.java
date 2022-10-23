package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046737 Reduced period of A000073 mod n.
 * @author Sean A. Irvine
 */
public class A046737 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    long a = 0;
    long b = 1;
    long c = 1;
    long k = 2;
    do {
      ++k;
      final long s = (a + b + c) % mN;
      a = b;
      b = c;
      c = s;
    } while (b != 0 || c != 0);
    return Z.valueOf(k);
  }
}
