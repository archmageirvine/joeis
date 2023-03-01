package irvine.oeis.a259;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002025;
import irvine.oeis.a002.A002046;

/**
 * A259180 Amicable pairs.
 * @author Georg Fischer
 */
public class A259180 extends Sequence1 {

  private int mN = 0;
  private final A002025 mSeq1 = new A002025();
  private final A002046 mSeq2 = new A002046();

  @Override
  public Z next() {
    ++mN;
    return ((mN & 1) == 1) ? mSeq1.next() : mSeq2.next();
  }
}
