package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A028334 Differences between consecutive odd primes, divided by 2.
 * @author Sean A. Irvine
 */
public class A028334 extends A001223 {

  /** Construct the sequence. */
  public A028334() {
    super(2);
  }

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
