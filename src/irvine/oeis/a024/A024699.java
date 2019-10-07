package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A024699 <code>a(n) = (prime(n+2)-1)/6</code> if this is an integer or <code>(prime(n+2)+ 1)/6</code> otherwise.
 * @author Sean A. Irvine
 */
public class A024699 extends A000040 {

  {
    super.next(); // skip 2
    super.next(); // skip 3
  }

  @Override
  public Z next() {
    return super.next().add(3).divide(6);
  }
}
