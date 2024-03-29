package irvine.oeis.a360;
// Generated by gen_seq4.pl ogf/lingf at 2023-05-01 21:59

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A360201 Number of induced paths in the n-ladder graph P_2 X P_n.
 * @author Georg Fischer
 */
public class A360201 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A360201() {
    super(1, "[0,1,5,3]", "[1,-3,2,1,-1]");
  }
}
