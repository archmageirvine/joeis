package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a219.A219180;

/**
 * A024936 <code>a(n) =</code> maximal length of partitions of n into distinct primes or -1 if there is no such partition.
 * @author Sean A. Irvine
 */
public class A024936 extends A219180 {

  @Override
  public Z next() {
    return Z.valueOf(super.nextRow().length - 1);
  }
}
