package irvine.oeis.a151;
// manually ca2elem/diffseq at 2021-12-23 19:20

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a079.A079317;

/**
 * A151921 Net gain in number of ON cells at stage n of the cellular automaton described in A079317.
 * @author Georg Fischer
 */
public class A151921 extends DifferenceSequence {

  private int mN;

  /** Construct the sequence. */
  public A151921() {
    super(new A079317());
    mN = -1;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return Z.valueOf(mN);
    }
    return super.next();
  }
}
