package irvine.oeis.a169;
// manually ca2elem/diffseq at 2021-12-23 19:20

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;

/**
 * A169648 Number of cells that are turned from OFF to ON at stage n in Wolfram's 2-D cellular automaton defined by Rule 942.
 * @author Georg Fischer
 */
public class A169648 extends DifferenceSequence {

  private int mN;

  /** Construct the sequence. */
  public A169648() {
    super(new A169649());
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ZERO;
    }
    return super.next();
  }
}
