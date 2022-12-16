package irvine.oeis.a355;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.a081.A081125;

/**
 * A355989 a(n) = n! / (2 * floor(n/2)!).
 * @author Georg Fischer
 */
public class A355989 extends A081125 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
