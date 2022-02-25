package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000796;

/**
 * A001355 Mix digits of Pi and e.
 * @author Sean A. Irvine
 */
public class A001355 extends A000796 {

  private int mN = -1;
  private Sequence mB = new A001113();

  @Override
  public Z next() {
    return ((++mN & 1) == 0) ? super.next() : mB.next();
  }
}
