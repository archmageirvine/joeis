package irvine.oeis.a078;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078155 A078152(n!).
 * @author Sean A. Irvine
 */
public class A078155 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z f = Functions.FACTORIAL.z(++mN);
    return f.multiply(4).add(Z.ONE).sqrt().subtract(Functions.SIGMA0.z(f)).subtract(1);
  }
}
