package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000032;
import irvine.oeis.a001.A001519;

/**
 * A005522.
 * @author Sean A. Irvine
 */
public class A005522 extends A000032 {

  private final Sequence mFib2 = new A001519();

  @Override
  public Z next() {
    return super.next().add(mFib2.next()).add(1);
  }
}
