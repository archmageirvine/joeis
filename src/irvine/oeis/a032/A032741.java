package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000005;

/**
 * A032741 <code>a(0) = 0;</code> for <code>n &gt; 0, a(n) =</code> number of proper divisors of <code>n</code> (divisors of n which are less than <code>n)</code>.
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
