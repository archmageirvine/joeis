package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-10-02.ack/lingf at 2024-10-02 22:45

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A375476 a(3*n)=A001045(n+1), a(3*n+1)=A084214(n), a(3*n+2)=A000079(n) for n &gt;= 0.
 * @author Georg Fischer
 */
public class A375476 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A375476() {
    super(0, "[1, 1, 1, 0, 0, 1, 0, 1]", "[1, 0, 0, -1, 0, 0, -2]");
  }
}
