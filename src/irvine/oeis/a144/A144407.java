package irvine.oeis.a144;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.a058.A058529;

/**
 * A144407 A058529(n+1)^2.
 * @author Georg Fischer
 */
public class A144407 extends A058529 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
