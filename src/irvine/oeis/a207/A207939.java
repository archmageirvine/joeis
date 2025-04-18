package irvine.oeis.a207;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A207939 Number of 3 X n 0..1 arrays avoiding 0 0 1 and 1 0 0 horizontally and 0 0 1 and 1 1 0 vertically.
 * @author Georg Fischer
 */
public class A207939 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A207939() {
    super(1, "[0,6,6,-76,-63,247,189,-223,-171,29,26]", "[1,-5,1,20,-10,-28,9,15,-1,-2]");
  }
}
