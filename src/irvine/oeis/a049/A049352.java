package irvine.oeis.a049;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a030.A030524;

/**
 * A049352 A triangle of numbers related to triangle A030524.
 * @author Sean A. Irvine
 */
public class A049352 extends A030524 {


  @Override
  public Z next() {
    return super.next().multiply(Functions.FACTORIAL.z(mN)).divide(Functions.FACTORIAL.z(mM)).divide(Z.THREE.pow(mN - mM));
  }
}
