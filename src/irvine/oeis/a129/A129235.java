package irvine.oeis.a129;
// manually diffs/diffseq at 2023-09-23 21:26

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a222.A222548;

/**
 * A129235 a(n) = 2*sigma(n) - tau(n), where tau(n) is the number of divisors of n (A000005) and sigma(n) is the sum of divisors of n (A000203).
 * @author Georg Fischer
 */
public class A129235 extends DifferenceSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A129235() {
    super(1, new A222548());
  }

  @Override
  public Z next() {
    return (++mN == 1) ? Z.ONE : super.next();
  }
}
