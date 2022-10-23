package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A000529 Powers of rooted tree enumerator.
 * @author Sean A. Irvine
 */
public class A000529 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    final Z n2 = n.square();
    final Z n4 = n2.square();
    return n4.multiply(n)
      .add(n4.multiply(30))
      .add(n2.multiply(n).multiply(275))
      .add(n2.multiply(990))
      .add(n.multiply(1104))
      .divide(120);
  }
}
