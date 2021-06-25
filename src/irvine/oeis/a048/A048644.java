package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000217;

/**
 * A048644 Differences between partial sums of Gray code (A048641) and triangular numbers (A000217).
 * @author Sean A. Irvine
 */
public class A048644 extends A048641 {

  private final Sequence mA = new A000217();

  @Override
  public Z next() {
    return super.next().subtract(mA.next());
  }
}
