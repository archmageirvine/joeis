package irvine.oeis.a243;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A243727 Number of length n+2 0..8 arrays with no three unequal elements in a row and no three equal elements in a row and new values 0..8 introduced in 0..8 order.
 * @author Georg Fischer
 */
public class A243727 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A243727() {
    super(1, "[0,3,-18,-36,346,99,-2696,175,10799,-195,-22430,-4582,19296,9401]", "[1,-8,0,139,-196,-960,1827,3456,-7076,-7239,12860,9148,-9072,-5760]");
  }
}
