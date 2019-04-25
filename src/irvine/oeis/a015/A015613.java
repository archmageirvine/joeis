package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.a002.A002088;

/**
 * A015613 <code>a(n) = Sum_{i=1..n}</code> phi(i)*ceiling(n/i) <code>- Sum_{i=1..n}</code> phi(i)*floor(n/i).
 * @author Sean A. Irvine
 */
public class A015613 extends A002088 {

  private long mN = 0;

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(++mN);
  }
}
