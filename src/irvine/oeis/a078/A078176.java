package irvine.oeis.a078;
// manually at 2021-12-19

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A078176 Numbers given by the Rule 225 Cellular Automaton.
 * @author Georg Fischer
 */
public class A078176 extends Cellular1DAutomaton {

  private int mN;

  /** Construct the sequence. */
  public A078176() {
    super(225);
    next();
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    return super.nextStageD().xor(Z.ONE.shiftLeft(2 * mN + 1).subtract(1));
  }
}
