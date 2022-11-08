package irvine.oeis.a334;
// manually lingf at 2022-11-07 09:27

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A334930 Numbers that generate rotationally symmetrical XOR-triangles featuring singleton zero bits in a hexagonal arrangement.
 * @author Georg Fischer
 */
public class A334930 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A334930() {
    super(1, "[0,1,11,4,-8]", "[1,0,-9,0,8]");
  }
}
