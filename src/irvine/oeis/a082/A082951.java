package irvine.oeis.a082;
// manually rowsums at 2023-05-31 12:02

import irvine.math.z.Z;
import irvine.oeis.a137.A137651;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A082951 Number of primitive (aperiodic) word structures of length n using an infinite alphabet.
 * @author Georg Fischer
 */
public class A082951 extends RowSumSequence {

  private int mN = -1;

  /** Construct the sequence. */
  public A082951() {
    super(0, new A137651());
  }

  @Override
  public Z next() {
    return (++mN == 0) ? Z.ONE : super.next();
  }
}
