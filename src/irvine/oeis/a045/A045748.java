package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045748 a(n) is the number consisting of the last n digits (although any leading 0's among those last n digits are omitted) of Sum_{j=1..k} j! for all sufficiently large k.
 * @author Sean A. Irvine
 */
public class A045748 implements Sequence {

  private Z mF = Z.ONE;
  private Z mS = Z.ONE;
  private long mN = 1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    mT = mT.multiply(10);
    Z r = mS.mod(mT);
    Z t;
    do {
      mF = mF.multiply(++mN);
      mS = mS.add(mF);
      t = r;
      r = mS.mod(mT);
    } while (!r.equals(t));
    return r;
  }
}
