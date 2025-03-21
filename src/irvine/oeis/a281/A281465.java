package irvine.oeis.a281;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A281465 Number of n X 4 0..1 arrays with no element equal to more than two of its horizontal, diagonal or antidiagonal neighbors and with new values introduced in order 0 sequentially upwards.
 * @author Georg Fischer
 */
public class A281465 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A281465() {
    super(1, "[0,8,29,-6,-12,-84,-59,50,90,10,-41]", "[1,-1,-1,-4,-1,4,5,0,-3]");
  }
}
