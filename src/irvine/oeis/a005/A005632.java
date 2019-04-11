package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a122.A122693;
import irvine.oeis.a122.A122747;
import irvine.oeis.a123.A123071;

/**
 * A005632 Bishops on <code>a 2n+1</code> X <code>2n+1</code> board (see Robinson paper for details).
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
