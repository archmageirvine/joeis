package irvine.oeis.a052;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000720;

/**
 * A052435 a(n) = round(li(n) - pi(n)), where li is the logarithmic integral and pi(x) is the number of primes &lt;= x.
 * @author Sean A. Irvine
 */
public class A052435 extends A000720 {

  /** Construct the sequence. */
  public A052435() {
    super(2);
  }

  private long mN = 1;

  {
    super.next();
  }

  @Override
  public Z next() {
    return CR.valueOf(++mN).li().subtract(CR.valueOf(super.next())).round();
  }
}
