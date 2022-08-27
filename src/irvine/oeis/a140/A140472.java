package irvine.oeis.a140;

import irvine.math.z.Z;
import irvine.oeis.a285.A285326;

/**
 * A140472 Chaotic sequence related to A004001: a(n) = a(n - a(n-1)) + a(floor(n/2)).
 * @author Georg Fischer
 */
public class A140472 extends A285326 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
