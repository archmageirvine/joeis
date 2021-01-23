package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A024698 a(n) = (prime(n+1) - 1)/4 if this is an integer or (prime(n+1) + 1)/4 otherwise.
 * @author Sean A. Irvine
 */
public class A024698 extends A000040 {

  {
    super.next(); // skip 2
  }

  @Override
  public Z next() {
    return super.next().add(2).divide(4);
  }
}
