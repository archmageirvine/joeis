package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076975 a(1) = 1, a(2n) = smallest composite number &gt; (2n-1)-th partial sum of the sequence itself and a(2n+1) = smallest prime &gt; 2n-th partial sum of the sequence.
 * @author Sean A. Irvine
 */
public class A076975 extends Sequence1 {

  private Z mS = null;
  private boolean mEven = true;

  @Override
  public Z next() {
    mEven = !mEven;
    if (mS == null) {
      mS = Z.ONE;
      return Z.ONE;
    }
    Z t = mS;
    do {
      t = t.add(1);
    } while (t.isProbablePrime() == mEven);
    mS = mS.add(t);
    return t;
  }
}

