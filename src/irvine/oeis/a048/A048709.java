package irvine.oeis.a048;

import irvine.math.z.Z;
import irvine.oeis.ca.Cellular1DAutomaton;

/**
 * A048709 Main diagonal of Family 1 "Rule 90 x Rule 150" array.
 * @author Georg Fischer
 */
public class A048709 extends Cellular1DAutomaton {

  protected int mN;
  
  /** Construct the sequence. */
  public A048709() {
    super(150);
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    Z term = super.nextStageD();
    for (int i = 0; i < mN; ++i) {
      term = term.xor(term.multiply(4));
    }
    return term;
  }
}
