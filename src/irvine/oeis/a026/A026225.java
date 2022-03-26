package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026225 Numbers of the form 3^i * (3k+1).
 * @author Sean A. Irvine
 */
public class A026225 extends A026224 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
