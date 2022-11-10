package irvine.oeis.a289;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000521;

/**
 * A289063 Coefficients in expansion of E_6^2/Product_{k&gt;=1} (1-q^k)^24.
 * @author Georg Fischer
 */
public class A289063 extends AbstractSequence {

  private int mN = -1;
  private final Sequence mSeq = new A000521();

  /** Construct the sequence. */
  public A289063() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    final Z result = mSeq.next();
    if (mN == 0) {
      return Z.ONE;
    }
    if (mN == 1) {
      return Z.valueOf(-984);
    }
    return result;
  }
}
