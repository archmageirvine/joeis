package irvine.oeis.a232;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A232258 Number of (1+1)X(n+1) 0..2 arrays with every element both &gt;= and &lt;= some horizontal or antidiagonal neighbor.
 * @author Georg Fischer
 */
public class A232258 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A232258() {
    super(1, "[0,9,-17,20,-63,37,-78,93,-9,61,72,-50,-16,8]", "[1,-6,3,-19,16,-13,45,10,26,11,-26,-4,4]");
  }
}
