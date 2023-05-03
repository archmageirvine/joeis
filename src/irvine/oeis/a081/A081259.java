package irvine.oeis.a081;
// manually n2/n3add1 at 2023-05-02 19:56

import irvine.math.z.Z;
import irvine.oeis.a151.A151799;

/**
 * A081259 a(n) is the smallest k such that C(3n,n) divides k!.
 * @author Georg Fischer
 */
public class A081259 extends A151799 {

  @Override
  public Z next() {
    final Z result = super.next();
    super.next();
    super.next();
    return result;
  }
}
