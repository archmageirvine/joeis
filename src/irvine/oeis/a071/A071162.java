package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a036.A036044;
import irvine.oeis.a209.A209642;

/**
 * A071162 Simple rewriting of binary expansion of n resulting A014486-codes for rooted binary trees with height equal to number of internal vertices. (Binary trees where at each internal vertex at least the other child is leaf).
 * @author Sean A. Irvine
 */
public class A071162 extends Sequence0 {

  private final Sequence mA = new PrependSequence(new A209642().skip(1), 1);
  private final DirectSequence mBcr = new A036044();

  @Override
  public Z next() {
    return mBcr.a(mA.next());
  }
}
