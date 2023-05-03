package irvine.oeis.a345;
// manually n2/n2add1 at 2023-05-02 19:56

import irvine.math.z.Z;
import irvine.oeis.a344.A344005;

/**
 * A345444 a(n) = A344005(2*n+1).
 * @author Georg Fischer
 */
public class A345444 extends A344005 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    return result;
  }
}
