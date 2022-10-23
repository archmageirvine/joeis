package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A052427 Baxter-Hickerson numbers.
 * @author Sean A. Irvine
 */
public class A052427 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    final Z t = Z.TEN.pow(++mN);
    final Z t2 = t.square();
    final Z t3 = t2.multiply(t);
    final Z t4 = t3.multiply(t);
    final Z t5 = t4.multiply(t);
    return t5.multiply2().subtract(t4).add(t3.multiply2()).add(t2).add(t).add(1).divide(3);
  }
}
