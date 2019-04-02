package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a006.A006061;

/**
 * A007667 The sum of both two and three consecutive squares.
 * @author Sean A. Irvine
 */
public class A007667 extends A006061 {

  @Override
  public Z next() {
    return super.next().multiply(3).add(2);
  }
}
