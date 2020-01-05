package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.a001.A001405;

/**
 * A028304 <code>a(n) = ceiling((1/(ceiling(n/2)+1))*binomial(n,floor(n/2)))</code> (interpolates between Catalan numbers).
 * @author Sean A. Irvine
 */
public class A028304 extends A001405 {

  private long mN = 0;

  @Override
  public Z next() {
    final long t = ++mN / 2;
    return super.next().add(t).divide(t + 1);
  }
}

