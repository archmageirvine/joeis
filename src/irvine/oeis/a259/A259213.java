package irvine.oeis.a259;
// manually tricolel

import irvine.math.z.Z;
import irvine.oeis.a258.A258829;

/**
 * A259213 Column 2 of triangle A258829.
 * @author Georg Fischer
 */
public class A259213 extends A258829 {

  private int mN = -1;

  {
    next();
    next();
  }

  @Override
  public Z next() {
    return super.compute(++mN, 2);
  }
}
