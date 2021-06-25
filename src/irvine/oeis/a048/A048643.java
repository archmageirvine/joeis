package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000142;

/**
 * A048643 Differences between partial products of Gray code (A048642) and factorials (A000142).
 * @author Sean A. Irvine
 */
public class A048643 extends A048642 {

  private final Sequence mA = new A000142();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
