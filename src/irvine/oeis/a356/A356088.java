package irvine.oeis.a356;
// Generated by gen_seq4.pl dirtraf at 2023-11-18 23:07

import irvine.oeis.a001.A001951;
import irvine.oeis.a022.A022838;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A356088 a(n) = A001951(A022838(n)).
 * @author Georg Fischer
 */
public class A356088 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A356088() {
    super(1, new A001951(), new A022838());
  }
}
