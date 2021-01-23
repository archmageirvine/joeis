package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.PositionSubsequence;

/**
 * A038032 A038025(n)=1.
 * @author Sean A. Irvine
 */
public class A038032 extends PositionSubsequence {

  /** Construct the sequence. */
  public A038032() {
    super(new A038025(), 1);
  }

  @Override
  public boolean isOk(final Z term) {
    return Z.ONE.equals(term);
  }
}
