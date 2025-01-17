package irvine.oeis.a198;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A198648 Number of n X 1 0..6 arrays with values 0..6 introduced in row major order and each element equal to at least one horizontal or vertical neighbor.
 * @author Georg Fischer
 */
public class A198648 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A198648() {
    super(1, "[0,0,1,-5,-5,50,-4,-184,36,303,-3,-189,-53]", "[1,-6,-1,60,-50,-226,231,416,-361,-388,180,144]");
  }
}
