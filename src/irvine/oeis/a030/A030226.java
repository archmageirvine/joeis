package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000228;
import irvine.oeis.a006.A006535;

/**
 * A030226.
 * @author Sean A. Irvine
 */
public class A030226 extends A000228 {

  private final Sequence mA = new A006535();

  @Override
  public Z next() {
    return mA.next().subtract(super.next());
  }
}
