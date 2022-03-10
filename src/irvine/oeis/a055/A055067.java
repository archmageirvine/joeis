package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;
import irvine.oeis.a007.A007955;

/**
 * A055067 Product of numbers &lt; n which do not divide n (or 1 if no such numbers exist).
 * @author Sean A. Irvine
 */
public class A055067 extends A000142 {

  private final Sequence mA = new A007955();
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().divide(mA.next());
  }
}
