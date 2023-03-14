package irvine.oeis.a079;
// manually knest at 2023-03-12

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a053.A053738;

/**
 * A079112 Numbers in binary representation with odd length.
 * @author Georg Fischer
 */
public class A079112 extends Sequence0 {

  private int mN = -1;
  private final A053738 mSeq = new A053738();

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ZERO : new Z(mSeq.next().toString(2));
  }
}
