package irvine.oeis.a257;
// manually 2024-06-14

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a053.A053669;

/**
 * A257993 Least gap in the partition having Heinz number n; index of the least prime not dividing n.
 * @author Georg Fischer
 */
public class A257993 extends AbstractSequence implements DirectSequence {

  private static final DirectSequence A053669 = new A053669();
  private int mN;

  /** Construct the sequence. */
  public A257993() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final Z n) {
    return Functions.PRIME_PI.z(A053669.a(n));
  }

  @Override
  public Z a(final int n) {
    return Functions.PRIME_PI.z(A053669.a(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }
}
