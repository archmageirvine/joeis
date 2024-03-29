package irvine.oeis.a356;
// Generated by gen_seq4.pl dirtraf at 2023-11-18 23:07

import irvine.oeis.a000.A000201;
import irvine.oeis.a022.A022839;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A356104 a(n) = A000201(A022839(n)).
 * @author Georg Fischer
 */
public class A356104 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A356104() {
    super(1, new A000201(), new A022839());
  }
}
