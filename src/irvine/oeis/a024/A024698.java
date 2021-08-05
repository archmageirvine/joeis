package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A024698 a(n) = (prime(n+1) - 1)/4 if this is an integer or (prime(n+1) + 1)/4 otherwise.
 * @author Sean A. Irvine
 */
public class A024698 extends A065091 {

  @Override
  public Z next() {
    return super.next().add(2).divide(4);
  }
}
