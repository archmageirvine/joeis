package irvine.oeis.a377;
// manually 2024-12-22/diffs at 2024-12-23 10:18

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a000.A000015;

/**
 * A377780 First differences of A000015 (smallest prime-power &gt;= n).
 * @author Georg Fischer
 */
public class A377780 extends DifferenceSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A377780() {
    super(1, new A000015());
  }

  @Override
  public Z next() {
    final Z result = super.next();
    return (++mN == 1) ? Z.ZERO : result;
  }
}
