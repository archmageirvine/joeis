package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000041;

/**
 * A046641 a(n) is the smallest positive integer m such that the number of partitions p(m) = A000041(m) is divisible by n.
 * @author Sean A. Irvine
 */
public class A046641 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final A000041 parts = new A000041();
    parts.next(); // skip p(0)
    long c = 1;
    while (true) {
      if (parts.next().mod(mN) == 0) {
        return Z.valueOf(c);
      }
      ++c;
    }
  }
}
