package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a029.A029710;

/**
 * A031505 Upper prime of a difference of 4 between primes.
 * @author Sean A. Irvine
 */
public class A031505 extends A029710 {

  @Override
  public Z next() {
    return super.next().add(4);
  }
}
