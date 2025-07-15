package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a008.A008480;
import irvine.oeis.a063.A063008;

/**
 * A078760 Combinations of a partition: number of ways to label a partition (of size n) with numbers 1 to n.
 * @author Sean A. Irvine
 */
public class A078760 extends A063008 {

  private final DirectSequence mSeq = new A008480();

  @Override
  public Z next() {
    return mSeq.a(super.next());
  }
}

