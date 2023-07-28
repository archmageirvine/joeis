package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A064784 Difference between n-th triangular number t(n) and the largest square &lt;= t(n).
 * @author Sean A. Irvine
 */
public class A064784 extends A000217 {

  {
    super.next();
    setOffset(1);
  }

  @Override
  public Z next() {
    final Z t = super.next();
    return t.subtract(t.sqrt().square());
  }
}

