package irvine.oeis.a231;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A231445 Number of (n+1) X (2+1) 0..3 arrays with no element unequal to a strict majority of its horizontal and antidiagonal neighbors, with values 0..3 introduced in row major order.
 * @author Georg Fischer
 */
public class A231445 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A231445() {
    super(1, "[0,3,-42,211,-516,645,-402,108]", "[1,-19,133,-461,867,-881,468,-108]");
  }
}
