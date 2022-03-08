package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055041 Numbers of the form 3^(2i+1)*(3*j+1).
 * @author Sean A. Irvine
 */
public class A055041 extends A055047 {

  @Override
  public Z next() {
    return super.next().multiply(3);
  }
}
