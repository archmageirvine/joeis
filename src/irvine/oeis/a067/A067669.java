package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067669 a(n)=(5^n)!/5^(floor(5^n/4)).
 * @author Sean A. Irvine
 */
public class A067669 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z t = Z.FIVE.pow(++mN);
    final Z f = Functions.FACTORIAL.z(t);
    return f.divide(Z.FIVE.pow(t.divide(4)));
  }
}
