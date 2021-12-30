package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A053575 Odd part of phi(n): a(n) = A000265(A000010(n)).
 * @author Sean A. Irvine
 */
public class A053575 extends A000010 {

  @Override
  public Z next() {
    return super.next().makeOdd();
  }
}
