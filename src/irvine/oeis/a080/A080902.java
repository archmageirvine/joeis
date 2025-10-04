package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080902 a(1)=1, a(n)=a(n-1)+2 if (n and n+3 are in the sequence), a(n)=a(n-1)+3 otherwise.
 * @author Sean A. Irvine
 */
public class A080902 extends Sequence1 {

  private final HashSet<Z> mS = new HashSet<>();
  private Z mA = Z.ONE;
  private long mN = 1;

  @Override
  public Z next() {
    if (!mS.isEmpty()) {
      mA = mA.add(mS.contains(Z.valueOf(++mN)) && mS.contains(Z.valueOf(mN + 3)) ? 2 : 3);
    }
    mS.add(mA);
    return mA;
  }
}

