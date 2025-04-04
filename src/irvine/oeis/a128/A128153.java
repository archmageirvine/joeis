package irvine.oeis.a128;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A128153 The number of regular pentagons found by constructing n equally-spaced points on each side of the pentagon and drawing lines parallel to the pentagon sides, as well as lines connecting vertices.
 * @author Georg Fischer
 */
public class A128153 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A128153() {
    super(0, "[1,7,2,-1,1]", "[1,-2,0,2,-1]");
  }
}
