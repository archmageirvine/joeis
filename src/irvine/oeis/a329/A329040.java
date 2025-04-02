package irvine.oeis.a329;
// manually 2025-04-01 direct

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a324.A324886;

/**
 * A329040 Number of distinct primorials in the greedy sum of primorials adding to A108951(n).
 * @author Georg Fischer
 */
public class A329040 extends AbstractSequence implements DirectSequence {

  private int mN;
  private static final DirectSequence A324886 = new A324886();

  /** Construct the sequence. */
  public A329040() {
    super(1);
    mN = 0;
  }

  @Override
  public Z a(final Z n) {
    return Functions.OMEGA.z(A324886.a(n));
  }

  @Override
  public Z a(final int n) {
    return Functions.OMEGA.z(A324886.a(n));
  }

  @Override
  public Z next() {
    return a(++mN);
  }

}
