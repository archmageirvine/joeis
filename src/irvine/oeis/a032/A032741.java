package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000005;

/**
 * A032741 a(0) = 0; for n &gt; 0, a(n) = number of proper divisors of n (divisors of n which are less than n).
 * @author Sean A. Irvine
 */
public class A032741 extends PrependSequence {

  /** Construct the sequence. */
  public A032741() {
    super(new A000005(), 1);
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
