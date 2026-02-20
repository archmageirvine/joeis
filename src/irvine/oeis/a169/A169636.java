package irvine.oeis.a169;

import java.util.Arrays;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a004.A004001;

/**
 * A083819.
 * @author Sean A. Irvine
 */
public class A169636 extends Sequence0 {

  private final Sequence mS = new A004001().prepend(0);
  private Z mPrev = Z.NEG_ONE;
  private int mN = 0;
  private int[] mK = {};

  @Override
  public Z next() {
    ++mN;
    final Z t = mS.next();
    if (t.equals(mPrev)) {
      ++mK[mK.length - 1];
    } else {
      mK = Arrays.copyOf(mK, mK.length + 1);
      mK[mK.length - 1] = 1;
      mPrev = t;
    }
    return Binomial.multinomial(mN, mK);
  }
}
