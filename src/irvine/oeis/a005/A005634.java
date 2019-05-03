package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a122.A122693;
import irvine.oeis.a122.A122749;

/**
 * A005634 Bishops on an <code>n X n</code> board (see Robinson paper for details).
 * @author Sean A. Irvine
 */
public class A005634 extends A122749 {

  private final Sequence mC = new A122693();
  private final Sequence mX = new A005633();
  private boolean mEven = false;

  {
    mX.next();
    mC.next();
  }

  @Override
  public Z next() {
    mEven = !mEven;
    if (mEven) {
      return super.next().subtract(mX.next().multiply(4)).divide(8);
    } else {
      return super.next().subtract(mC.next()).subtract(mX.next().multiply(4)).divide(8);
    }
  }
}
