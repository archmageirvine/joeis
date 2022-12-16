package irvine.oeis.a350;
// manually dersimple at 2022-12-15 22:48

import irvine.math.z.Z;
import irvine.oeis.a045.A045913;

/**
 * A350870 Numbers k = x.y such that x.y = (x+y)^2, when x and y have the same number of digits, "." means concatenation, and y may not begin with 0.
 * @author Georg Fischer
 */
public class A350870 extends A045913 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
