package irvine.oeis.a085;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A085068 Number of steps &gt;= 1 for iteration of map x -&gt; (4/3)*ceiling(x) to reach an integer when started at n, or -1 if no such integer is ever reached.
 * @author Sean A. Irvine
 */
public class A085068 extends Sequence0 {

  private static final Q C = new Q(4, 3);
  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Q t = Q.valueOf(mN);
    long cnt = 0;
    do {
      ++cnt;
      t = C.multiply(t.ceiling());
    } while (!t.isInteger() || t.toZ().compareTo(mN) < 0);
    return Z.valueOf(cnt);
  }
}

