package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002464;

/**
 * A383857 Number of permutations of [n] such that precisely one rising or falling succession occurs, but without either n(n-1) or (n-1)n.
 * @author Sean A. Irvine
 */
public class A383857 extends Sequence1 {

  private final Sequence mB = new A002464().skip();
  private Z mT = mB.next();
  private long mN = -1;

  @Override
  public Z next() {
    final Z b = mT.multiply(++mN);
    mT = mB.next();
    return mT.subtract(b);
  }
}

