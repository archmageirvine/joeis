package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005811;

/**
 * A033264 Number of blocks of {1,0} in the binary expansion of n.
 * @author Sean A. Irvine
 */
public class A033264 extends Sequence0 {

  private final A005811 mSeq = new A005811();

  @Override
  public Z next() {
    final Z a = mSeq.next();
    return a.subtract(a.add(1).divide2());
  }
}

