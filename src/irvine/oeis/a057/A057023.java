package irvine.oeis.a057;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A057023 Largest odd factor of (n-th prime-1); k when n-th prime is written as k*2^m+1 [with k odd].
 * @author Sean A. Irvine
 */
public class A057023 extends A000040 {

  @Override
  public Z next() {
    final Z[] d = Jaguar.factor(super.next().subtract(1).makeOdd()).divisorsSorted();
    return d[d.length - 1];
  }
}
