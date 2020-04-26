package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.a001.A001615;

/**
 * A031359 Bisection of <code>A001615</code>.
 * @author Sean A. Irvine
 */
public class A031359 extends A001615 {

  @Override
  public Z next() {
    final Z t = super.next();
    super.next();
    return t;
  }
}
