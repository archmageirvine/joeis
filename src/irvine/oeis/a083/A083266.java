package irvine.oeis.a083;
// Generated by gen_seq4.pl 2024-07-24.ack/sintrif at 2024-07-24 22:30

import irvine.math.function.Functions;
import irvine.oeis.a023.A023896;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A083266 Sum of related numbers (counted in A073757) belonging to n: a(n) = A000203(n) + A023896(n) - 1; related = {divisor-set, RRS}.
 * @author Georg Fischer
 */
public class A083266 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A083266() {
    super(1, (term, n) -> Functions.SIGMA1.z(n).add(term).subtract(1), "", new A023896());
  }
}
