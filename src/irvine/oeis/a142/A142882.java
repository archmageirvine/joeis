package irvine.oeis.a142;
// manually bisect at 2022-12-24 11:49

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a120.A120070;

/**
 * A142882 First trisection of A120070.
 * @author Georg Fischer
 */
public class A142882 extends Sequence1 {

  private final A120070 mSeq = new A120070();

  @Override
  public Z next() {
    final Z result = mSeq.next();
    mSeq.next();
    mSeq.next();
    return result;
  }
}
