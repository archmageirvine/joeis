package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a030.A030124;

/**
 * A081688 0 followed by A030124 - 1.
 * @author Georg Fischer
 */
public class A081688 extends Sequence0 {

  private int mN = -1;
  private final A030124 mSeq = new A030124();

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ZERO : mSeq.next().subtract(1);
  }
}
