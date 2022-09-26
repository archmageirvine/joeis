package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;

/**
 * A035499 Turns at which card 1 surfaces in Guy's shuffling problem (A035485).
 * @author Sean A. Irvine
 */
public class A035499 extends PositionSubsequence {

  /** Construct the sequence. */
  public A035499() {
    super(new A035492(), 0);
  }

  @Override
  public int getOffset() {
    return 0;
  }

  @Override
  public boolean isOk(final Z term) {
    return Z.ONE.equals(term);
  }
}

