package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000081;

/**
 * A001257 Squares of numbers of rooted trees.
 * @author Sean A. Irvine
 */
public class A001257 extends A000081 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().square();
  }
}
