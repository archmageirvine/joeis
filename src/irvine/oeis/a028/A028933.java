package irvine.oeis.a028;

import irvine.math.z.Z;

/**
 * A028933 Table of winning positions in Tchoukaillon (or Mancala) solitaire.
 * @author Sean A. Irvine
 */
public class A028933 extends A028932 {

  private int mM = 0;

  @Override
  public Z next() {
    if (++mM >= mStones.length) {
      step();
      mM = 0;
    }
    return Z.valueOf(mStones[mM]);
  }
}

