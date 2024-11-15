package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073072 Minimum value of abs(n^2-x^3) x&gt;0.
 * @author Sean A. Irvine
 */
public class A073072 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n2 = Z.valueOf(++mN).square();
    final Z r = n2.root(3);
    final Z u = r.pow(3);
    final Z v = r.add(1).pow(3);
    return n2.subtract(u).min(v.subtract(n2));
  }
}

