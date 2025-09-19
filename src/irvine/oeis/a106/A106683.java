package irvine.oeis.a106;

import irvine.math.z.Z;
import irvine.oeis.a003.A003022;

/**
 * A106683 Triangle read by rows: row n gives marks on lexicographically earliest n-mark optimal Golomb ruler.
 * @author Sean A. Irvine
 */
public class A106683 extends A003022 {

  private int mM = -1;

  /** Construct the sequence. */
  public A106683() {
    super(1);
  }

  @Override
  public Z next() {
    if (++mM == 0) {
      return Z.ZERO;
    }
    if (mM >= mPositions.length) {
      super.next();
      mM = 0;
    }
    return Z.valueOf(mPositions[mM]);
  }
}
