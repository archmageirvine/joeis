package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000142;
import irvine.oeis.a049.A049774;

/**
 * A065429 Number of permutations of {1..n} which contain 3 consecutive terms in increasing order.
 * @author Sean A. Irvine
 */
public class A065429 extends Sequence1 {

  private final Sequence mA = new A049774().skip();
  private final Sequence mF = new A000142().skip();

  @Override
  public Z next() {
    return mF.next().subtract(mA.next());
  }
}
