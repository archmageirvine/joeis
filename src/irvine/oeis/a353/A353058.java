package irvine.oeis.a353;
// manually knestm/knest at 2023-03-02 16:06

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a061.A061339;

/**
 * A353058 Minimum number of iterations {add or subtract 1, or half if even} needed to reach 1, starting from n.
 * @author Georg Fischer
 */
public class A353058 extends Sequence1 {

  private final A061339 mSeq = new A061339();

  {
    mSeq.next();
  }

  @Override
  public Z next() {
    return mSeq.next().subtract(1);
  }
}
