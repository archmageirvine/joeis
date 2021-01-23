package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.a002.A002088;

/**
 * A015614 a(n) = -1 + Sum_{i=1..n} phi(i).
 * @author Sean A. Irvine
 */
public class A015614 extends A002088 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
