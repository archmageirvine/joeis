package irvine.oeis.a336;
// Generated by gen_seq4.pl 2024-01-15/dirtraf at 2024-01-17 19:19

import irvine.oeis.a003.A003961;
import irvine.oeis.a007.A007733;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A336843 Period of binary representation of 1/A003961(n): a(n) = A007733(A003961(n)).
 * @author Georg Fischer
 */
public class A336843 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A336843() {
    super(1, new A007733(), new A003961());
  }
}
