package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a122.A122693;
import irvine.oeis.a122.A122747;
import irvine.oeis.a123.A123071;

/**
 * A005632 Bishops on a <code>2n+1 X 2n+1</code> board (see Robinson paper for <code>details)</code>.
 * @author Sean A. Irvine
 */
public class A005632 extends A122693 {

  private final Sequence mS = new A123071();
  private final Sequence mQ = new A122747();
  private long mN = -1;

  {
    next();
  }

  @Override
  public Z next() {
    ++mN;
    if ((mN & 3) == 0) {
      return super.next().subtract(mS.next()).subtract(mQ.next()).divide(4);
    } else {
      return super.next().subtract(mS.next()).divide(4);
    }
  }
}
