package irvine.oeis.a101;
// manually ca2elem/ca2rightd at 2021-12-23 19:20

import irvine.math.z.Z;
import irvine.oeis.ca.FiveNeighbor2DAutomaton;

/**
 * A101692 A modular binomial sum transform of 2^n.
 * @author Georg Fischer
 */
public class A101692 extends FiveNeighbor2DAutomaton {

  /** Construct the sequence. */
  public A101692() {
    super(4);
    next();
  }

  @Override
  public Z next() {
    return super.nextOriginRightD();
  }
}
