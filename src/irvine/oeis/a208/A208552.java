package irvine.oeis.a208;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A208552 Number of n X 5 0..1 arrays avoiding 0 0 0 and 0 0 1 horizontally and 0 0 1 and 0 1 1 vertically.
 * @author Georg Fischer
 */
public class A208552 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A208552() {
    super(1, "[0,16,224,432,1089,750,604,90,30,10,-4,-2,1]", "[1,-2,-4,10,5,-20,0,20,-5,-10,4,2,-1]");
  }
}
