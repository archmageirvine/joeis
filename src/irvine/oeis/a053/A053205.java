package irvine.oeis.a053;

import irvine.math.z.Z;

/**
 * A014410 Elements in Pascal's triangle (by row) that are not 1.
 * @author Sean A. Irvine
 */
public class A053205 extends A053204 {

  {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(2);
  }
}
