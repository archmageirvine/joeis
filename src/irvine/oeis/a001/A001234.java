package irvine.oeis.a001;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A001234 Unsigned Stirling numbers of the first kind s(n,7).
 * @author Sean A. Irvine
 */
public class A001234 extends AbstractSequence {

  /** Construct the sequence. */
  public A001234() {
    super(7);
  }

  private long mN = 6;

  @Override
  public Z next() {
    return Stirling.firstKind(++mN, 7).abs();
  }
}
