package irvine.oeis.a089;

import irvine.math.z.Z;
import irvine.oeis.a003.A003623;

/**
 * A089910 Indices n at which blocks (1;1) occur in infinite Fibonacci word, i.e., such that A005614(n-1) = A005614(n-2) = 1.
 * @author Georg Fischer
 */
public class A089910 extends A003623 {

  @Override
  public Z next() {
    return super.next().add(1);
  }
}
