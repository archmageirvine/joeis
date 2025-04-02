package irvine.oeis.a283;
// manually 2025-04-01 direct

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003961;
import irvine.oeis.a006.A006519;

/**
 * A283980 a(n) = A003961(n)*A006519(n).
 * @author Georg Fischer
 */
public class A283980 extends AbstractSequence implements DirectSequence {

  private int mN;
  private static final DirectSequence A003961 = new A003961();
  private static final DirectSequence A006519 = new A006519();

  /** Construct the sequence. */
  public A283980() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final Z n) {
    return A003961.a(n).multiply(A006519.a(n));
  }

  @Override
  public Z a(final int n) {
    return A003961.a(n).multiply(A006519.a(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
