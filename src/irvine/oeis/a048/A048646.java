package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A048646 Primes p such that the decimal digits of p^2 can be partitioned into two or more nonzero squares.
 * @author Sean A. Irvine
 */
public class A048646 extends A000040 {

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (A048653.isSquarePartitionable(p.square().toString())) {
        return p;
      }
    }
  }
}
