package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a057.A057677;

/**
 * A066932 a(n) is the denominator of b(n) where b(n)=1/b(n-1)+1/b(n-2) with b(1)=1 and b(2)=2.
 * @author Sean A. Irvine
 */
public class A066932 extends A057677 {

  @Override
  public Z next() {
    return nextQ().den();
  }
}
