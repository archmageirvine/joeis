package irvine.oeis.a183;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A183655 Number of (n+1) X 3 0..5 arrays with every 2 X 2 subblock summing to 10.
 * @author Georg Fischer
 */
public class A183655 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A183655() {
    super(1, "[0,666,-11544,75258,-227964,315504,-155520]", "[1,-21,175,-735,1624,-1764,720]");
  }
}
