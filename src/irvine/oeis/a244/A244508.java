package irvine.oeis.a244;
// manually 2026-10-04/diffs at 2026-10-04 

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a182.A182908;

/**
 * A244508 Number of odd prime powers (A246655) between 2^n and 2^(n+1).
 * @author Georg Fischer
 */
public class A244508 extends DifferenceSequence {

  /** Construct the sequence. */
  public A244508() {
    super(0, new A182908().prepend(0));
  }

  @Override
  public Z next() {
    return super.next().subtract(1);
  }
}
