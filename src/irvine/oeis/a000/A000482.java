package irvine.oeis.a000;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A000482 Unsigned Stirling numbers of first kind s(n, 5).
 * @author Sean A. Irvine
 */
public class A000482 extends AbstractSequence {

  /** Construct the sequence. */
  public A000482() {
    super(5);
  }

  private int mN = 4;

  @Override
  public Z next() {
    return Stirling.firstKind(++mN, 5).abs();
  }
}
