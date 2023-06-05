package irvine.oeis.a103;

import irvine.math.z.Z;
import irvine.oeis.a211.A211487;

/**
 * A103131 The product of the residues in [1,n] relatively prime to n, taken modulo n.
 * @author Georg Fischer
 */
public class A103131 extends A211487 {

  private int mN = 0;

  /** Construct the sequence. */
  public A103131() {
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    // For n > 2, a(n) = (-1)^A211487(n).
    return (++mN <= 2) ? Z.valueOf(mN - 1) : (super.next().testBit(0) ? Z.NEG_ONE : Z.ONE);
  }
}
