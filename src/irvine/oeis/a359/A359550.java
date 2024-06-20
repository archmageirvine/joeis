package irvine.oeis.a359;
// manually 2024-06-20

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a048.A048103;

/**
 * A359550 Multiplicative with a(p^e) = 1 if p &gt; e, otherwise 0.
 * @author Georg Fischer
 */
public class A359550 extends AbstractSequence implements DirectSequence {

  private int mN;

  /** Construct the sequence. */
  public A359550() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final Z n) {
    return A048103.isOk(Jaguar.factor(n)) ? Z.ONE : Z.ZERO;
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return a(Z.valueOf(++mN));
  }

}
