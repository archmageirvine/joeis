package irvine.oeis.a358;
// manually ogf/lingf at 2023-05-01 14:27

import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A358800 Number of (undirected) paths in the grid graph P_4 X P_n.
 * @author Georg Fischer
 */
public class A358800 extends GeneratingFunctionSequence {

  /** Construct the sequence. */
  public A358800() {
    super(1, "[0,6,-16,-416,4018,-17938,50228,-97356,131868,-116556,55784,-2296,-18094,20784,-12882,1542,1748,-430,-4,-24,-2,4]", "[1,-27,318,-2162,9476,-28327,59457,-88270,90466,-57194,9664,20392,-21783,8809,724,-2316,732,135,-99,0,4]");
  }
}
