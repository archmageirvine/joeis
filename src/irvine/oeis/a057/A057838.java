package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;
import irvine.oeis.a055.A055079;

/**
 * A057838 Numbers n such that A055079(n) = 2^n.
 * @author Sean A. Irvine
 */
public class A057838 extends PositionSubsequence {

  /** Construct the sequence. */
  public A057838() {
    super(new A055079(), 1);
  }

  @Override
  public boolean isOk(final Z term) {
    return term.equals(Z.ONE.shiftLeft(mN));
  }
}
