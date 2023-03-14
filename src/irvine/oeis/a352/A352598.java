package irvine.oeis.a352;
// manually knestm/knest at 2023-03-13

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a051.A051801;

/**
 * A352598 a(n) is the product of the squares of the nonzero digits of n.
 * @author Georg Fischer
 */
public class A352598 extends Sequence1 {

  private final A051801 mSeq = new A051801();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().square();
  }
}
