package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086799 Replace all trailing 0's with 1's in binary representation of n.
 * @author Sean A. Irvine
 */
public class A086799 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    long b = 1;
    while ((m & b) == 0) {
      m += b;
      b <<= 1;
    }
    return Z.valueOf(m);
  }
}
