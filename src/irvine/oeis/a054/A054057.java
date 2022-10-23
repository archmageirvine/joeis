package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054057 Numbers of form 41+n^2+n or 41+2*n^2.
 * @author Sean A. Irvine
 */
public class A054057 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.valueOf(41));
  }
  private long mN = 1;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(Z.valueOf(mN).square().add(mN + 41)) >= 0) {
      final Z n2 = Z.valueOf(mN).square();
      mA.add(n2.add(mN + 41));
      mA.add(n2.multiply2().add(41));
      ++mN;
    }
    return mA.pollFirst();
  }
}
