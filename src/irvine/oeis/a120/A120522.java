package irvine.oeis.a120;
// manually diffseq at 2023-05-31 14:02

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a006.A006949;

/**
 * A120522 First differences of successive meta-Fibonacci numbers A006949.
 * @author Georg Fischer
 */
public class A120522 extends DifferenceSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A120522() {
    super(1, new A006949());
  }

  @Override
  public Z next() {
    return (++mN == 1) ? super.next().add(1) : super.next();
  }
}
