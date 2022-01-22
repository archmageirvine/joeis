package irvine.oeis.a054;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054056 Numbers of form 29+n^2+n or 29+2*n^2.
 * @author Sean A. Irvine
 */
public class A054056 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  {
    mA.add(Z.valueOf(29));
  }
  private long mN = 1;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(Z.valueOf(mN).square().add(mN + 29)) >= 0) {
      final Z n2 = Z.valueOf(mN).square();
      mA.add(n2.add(mN + 29));
      mA.add(n2.multiply2().add(29));
      ++mN;
    }
    return mA.pollFirst();
  }
}
