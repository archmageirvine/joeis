package irvine.oeis.a186;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A186011 1/8192 the number of (n+2) X 3 0..3 arrays with no 3 X 3 subblock trace equal to any horizontal or vertical neighbor 3 X 3 subblock trace.
 * @author Georg Fischer
 */
public class A186011 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A186011() {
    super(1, "[0,32,734,5436,14544,10800]", "[1,-32,-1101,-9060,-25452,-19440]");
  }
}
