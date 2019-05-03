package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a122.A122748;
import irvine.oeis.a123.A123071;

/**
 * A005633 Bishops on an <code>n X n</code> board (see Robinson paper for details).
 * @author Sean A. Irvine
 */
public class A005633 extends A122748 {

  private final Sequence mS = new A123071();
  private long mN = -1;

  {
    next();
  }

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 1) {
      return super.next().subtract(mS.next()).divide2();
    } else {
      return super.next().divide2();
    }
  }
}
