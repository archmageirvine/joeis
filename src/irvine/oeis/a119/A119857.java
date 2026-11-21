package irvine.oeis.a119;

import irvine.math.z.Z;
import irvine.oeis.a329.A329054;

/**
 * A119857 Number of equicolored (unrooted) trees on 2n nodes.
 * @author Gregory Morse
 */
public class A119857 extends A329054 {
  private int mN = 0;

  /** Construct the sequence. */
  public A119857() {
    setOffset(1);
  }

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
