package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a110.A110117;
import irvine.oeis.a110.A110118;

/**
 * A014248 a(n) = b(n) - c(n) where b(n) = [ n*(sqrt(2)+sqrt(3)) ] and c(n) is the n-th number not in sequence b( ).
 * @author Sean A. Irvine
 */
public class A014248 extends A110117 {

  private final A110118 mA = new A110118();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
