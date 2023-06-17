package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000770 Stirling numbers of the second kind, S(n, 6).
 * @author Sean A. Irvine
 */
public class A000770 extends AbstractSequence {

  /** Construct the sequence. */
  public A000770() {
    super(6);
  }

  private int mN = 5;

  @Override
  public Z next() {
    return Stirling.secondKind(++mN, 6);
  }
}
