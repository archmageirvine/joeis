package irvine.oeis.a117;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a034.A034386;
import irvine.oeis.a049.A049614;

/**
 * A117733 Sum of the n-th primorial and the n-th compositorial number.
 * @author Georg Fischer
 */
public class A117733 extends Sequence0 {

  private final A034386 mSeq1 = new A034386();
  private final A049614 mSeq2 = new A049614();

  @Override
  public Z next() {
    return mSeq1.next().add(mSeq2.next());
  }
}
