package irvine.oeis.a324;
// Generated by gen_seq4.pl 2024-03-26/dirtraf at 2024-03-26 23:22

import irvine.oeis.a083.A083254;
import irvine.oeis.a163.A163511;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A324182 a(n) = A083254(A163511(n)), where A083254(n) = 2*phi(n) - n, the M\u00f6bius transform of the deficiency of n.
 * @author Georg Fischer
 */
public class A324182 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A324182() {
    super(0, new A083254(), new A163511());
  }
}
