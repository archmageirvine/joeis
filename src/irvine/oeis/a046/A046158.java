package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;

/**
 * A036417.
 * @author Sean A. Irvine
 */
public class A046158 extends PositionSubsequence {

  /** Construct the sequence. */
  public A046158() {
    super(new A046157(), 1);
  }

  @Override
  public boolean isOk(final Z term) {
    return Z.ZERO.equals(term);
  }
}
