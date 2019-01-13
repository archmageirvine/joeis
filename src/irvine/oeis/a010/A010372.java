package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a000.A000602;

/**
 * A010372.
 * @author Sean A. Irvine
 */
public class A010372 extends A000602 {

  private final A010373 mA = new A010373();
  private boolean mOdd = false;

  {
    super.next();
  }

  @Override
  public Z next() {
    mOdd = !mOdd;
    return mOdd ? super.next() : super.next().subtract(mA.next());
  }
}
