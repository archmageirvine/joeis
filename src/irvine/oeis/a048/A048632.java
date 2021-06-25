package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;

/**
 * A048632 Differences between factorials and Xfactorials: A048631 - A000142.
 * @author Sean A. Irvine
 */
public class A048632 extends A048631 {

  private final Sequence mA = new A000142();

  @Override
  public Z next() {
    return mA.next().subtract(super.next());
  }
}

