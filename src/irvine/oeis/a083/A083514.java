package irvine.oeis.a083;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A083514 Number of steps for iteration of map x -&gt; (4/3)*ceiling(x) to reach an integer &gt; 3n+1 when started at 3n+1, or -1 if no such integer is ever reached.
 * @author Sean A. Irvine
 */
public class A083514 extends Sequence0 {

  private static final Q C = new Q(4, 3);
  private Z mN = Z.valueOf(-2);

  @Override
  public Z next() {
    mN = mN.add(3);
    Q t = Q.valueOf(mN);
    long cnt = 0;
    do {
      ++cnt;
      t = C.multiply(t.ceiling());
    } while (!t.isInteger() || t.toZ().compareTo(mN) < 0);
    return Z.valueOf(cnt);
  }
}

