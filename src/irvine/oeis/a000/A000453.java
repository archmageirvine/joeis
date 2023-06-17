package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000453 Stirling numbers of the second kind, S(n, 4).
 * @author Sean A. Irvine
 */
public class A000453 extends AbstractSequence {

  /* Construct the sequence. */
  public A000453() {
    super(4);
  }

  private int mN = 3;

  @Override
  public Z next() {
    return Stirling.secondKind(++mN, 4);
  }
}
