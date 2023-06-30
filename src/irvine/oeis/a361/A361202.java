package irvine.oeis.a361;
// manually ogf/lingf at 2023-06-30 07:38

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A361202 Maximum product of the vertex arboricities of a graph of order n and its complement.
 * @author Georg Fischer
 */
public class A361202 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A361202() {
    super(0, "[1,-1,1]", "[1,-2,1,0,0,0,0,0,-1,2,-1]");
    setOffset(1);
  }
}
