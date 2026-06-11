package irvine.oeis.a117;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.a191.A191690;

/**
 * A117667 a(n) = n^n - n^(n-1) - n^(n-2) - n^(n-3) - ... - n^3 - n^2 - n.
 * @author Georg Fischer
 */
public class A117667 extends AbstractSequence {

  private boolean mFirst = true;

  private final A191690 mSeq = new A191690();

  /** Construct the sequence. */
  public A117667() {
    super(0);
  }

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return mSeq.next().add(1);
  }
}
