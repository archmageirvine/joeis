package irvine.oeis.a076;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076820 Second-largest distinct prime dividing n (or 1 if n is a power of a prime).
 * @author Sean A. Irvine
 */
public class A076820 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] p = Jaguar.factor(++mN).toZArray();
    return p.length < 2 ? Z.ONE : p[p.length - 2];
  }
}

