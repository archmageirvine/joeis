package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000481 Stirling numbers of the second kind, S(n, 5).
 * @author Sean A. Irvine
 */
public class A000481 extends AbstractSequence {

  /** Construct the sequence. */
  public A000481() {
    super(5);
  }

  private int mN = 4;

  @Override
  public Z next() {
    return Stirling.secondKind(++mN, 5);
  }
}
