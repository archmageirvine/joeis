package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a123.A123071;

/**
 * A005631 Bishops on <code>a 2n+1</code> X <code>2n+1</code> board (see Robinson paper for details).
 * @author Sean A. Irvine
 */
public class A005631 extends A123071 {

  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
