package irvine.oeis.a179;
// Generated by gen_seq4.pl 2024-12-28.ack/lingfcj at 2024-12-28 22:36

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A179581 Number of permutations of 1..n+6 with the number moved left exceeding the number moved right by n or more.
 * @author Georg Fischer
 */
public class A179581 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A179581() {
    super(1, "[0,1823,-19427,89014,-229394,364170,-365192,226176,-79168,12000]", "[1,-14,85,-294,639,-906,839,-490,164,-24]");
  }
}
