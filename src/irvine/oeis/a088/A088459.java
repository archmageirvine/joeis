package irvine.oeis.a088;
// manually 2021-09-27

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A088459 Triangle read by rows: T(n,k) represents the number of lozenge tilings of an (n,1,n)-hexagon which include the non-vertical tile above the main diagonal starting in position k+1.
 * @author Georg Fischer
 */
public class A088459 extends Sequence1 {

  protected long mN;
  protected long mK;

  /** Construct the sequence. */
  public A088459() {
    mN = 0; // even numbered rows
    mK = 0;
  }

  @Override
  public Z next() {
    ++mK;
    if (mK > mN) {
      mN += 2;
      mK = 1;
    }
    return A088855.element(mN, mK);
  }
}
