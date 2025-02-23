package irvine.oeis.a269;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A269104 Number of n X 3 0..3 arrays with some element plus some horizontally or vertically adjacent neighbor totalling three no more than once.
 * @author Georg Fischer
 */
public class A269104 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A269104() {
    super(1, "[0,60,-420,948,-828,216]", "[1,-36,378,-972,729]");
  }
}
