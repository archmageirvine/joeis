package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082995 Distance from n!+1 to next larger square.
 * @author Sean A. Irvine
 */
public class A082995 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z f1 = Functions.FACTORIAL.z(++mN).add(1);
    return f1.sqrt().add(1 - f1.auxiliary()).square().subtract(f1);
  }
}
