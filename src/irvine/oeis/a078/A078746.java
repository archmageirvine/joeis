package irvine.oeis.a078;
// Generated by gen_seq4.pl 2024-06-23/sintrif at 2024-06-23 23:33

import irvine.math.function.Functions;
import irvine.oeis.a001.A001844;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A078746 a(n) = prime(2*n*(n+1)+1).
 * @author Georg Fischer
 */
public class A078746 extends SingleTransformSequence {

  /** Construct the sequence. */
  public A078746() {
    super(0, (term, n) -> Functions.PRIME.z(term), "", new A001844());
  }
}
