package irvine.oeis.a304;
// Generated by gen_seq4.pl build/rowsums at 2022-05-10 21:33

import irvine.oeis.a308.A308680;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A304969 Expansion of 1/(1 - Sum_{k&gt;=1} q(k)*x^k), where q(k) = number of partitions of k into distinct parts (A000009).
 * @author Georg Fischer
 */
public class A304969 extends RowSumSequence {

  /** Construct the sequence. */
  public A304969() {
    super(new A308680());
  }
}
