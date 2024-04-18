package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067668 a(n)=(3^n)!/3^(floor(3^n/2)).
 * @author Sean A. Irvine
 */
public class A067668 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.THREE.pow(++mN);
    final Z f = Functions.FACTORIAL.z(t);
    return f.divide(Z.THREE.pow(t.divide2()));
  }
}
