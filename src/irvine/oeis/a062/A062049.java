package irvine.oeis.a062;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A061850.
 * @author Sean A. Irvine
 */
public class A062049 extends A002110 {

  private long mN = 0;
  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    return CR.valueOf(super.next()).pow(new Q(1, ++mN)).floor();
  }
}

