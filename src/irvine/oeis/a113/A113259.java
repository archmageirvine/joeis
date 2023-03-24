package irvine.oeis.a113;
// manually simple3 at 2023-03-23 22:27

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A113259 Expansion of psi(x)^5 / psi(x^5) - 25*x^2 * psi(x) * psi(x^5)^3 in powers of x where psi() is a Ramanujan theta function.
 * @author Georg Fischer
 */
public class A113259 extends AbstractSequence {

  private int mN = -1;
  private final A113260 mSeq = new A113260();

  /** Construct the sequence. */
  public A113259() {
    super(0);
  }

  @Override
  public Z next() {
    ++mN;
    return (mN == 0) ? Z.ONE : Z.FIVE.multiply(mSeq.next());
  }
}
