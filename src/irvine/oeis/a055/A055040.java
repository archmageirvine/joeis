package irvine.oeis.a055;

import irvine.math.z.Z;

/**
 * A055040 Numbers of the form 3^(2i+1)*(3*j+2).
 * @author Sean A. Irvine
 */
public class A055040 extends A055048 {

  @Override
  public Z next() {
    return super.next().multiply(3);
  }
}
