package irvine.oeis.a365;
// Generated by gen_seq4.pl robots/lingf at 2023-11-09 11:57

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A365929 Number of intersections formed within a triangle by placing n points "in general position" on each of the three sides and connecting each point to each of the points on the other two sides using straight lines.
 * @author Georg Fischer
 */
public class A365929 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A365929() {
    super(0, "[0, 0, 15, 33, 6]", "[1,-5, 10,-10, 5,-1]");
  }
}
