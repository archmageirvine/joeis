package irvine.oeis.a100;
// manually amoda

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A100102 a(n) = 2^(2*n)-(2*n-1).
 * @author Georg Fischer
 */
public class A100102 extends AbstractSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A100102() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN * 2L).subtract(mN * 2L - 1);
  }
}
