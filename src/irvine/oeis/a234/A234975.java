package irvine.oeis.a234;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A234975 Number of (n+1) X (1+1) 0..4 arrays with every 2 X 2 subblock having the sum of the absolute values of the edge differences equal to 8.
 * @author Georg Fischer
 */
public class A234975 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A234975() {
    super(1, "[0,182,26,-2922,958,11046,-5886,-2394]", "[1,-9,-13,134,-1,-480,224,96]");
  }
}
