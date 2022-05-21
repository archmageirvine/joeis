package irvine.oeis.a073;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A073120 Areas of Pythagorean (or right) triangles with integer sides of the form (2mn, m^2 - n^2, m^2 + n^2).
 * @author Sean A. Irvine
 */
public class A073120 implements Sequence {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.TWO;

  @Override
  public Z next() {
    while (mA.isEmpty() || mA.first().compareTo(mN.square()) > 0) {
      for (long m = 1; m < mN.longValueExact(); ++m) {
        mA.add(mN.multiply(m).multiply(mN.square().subtract(Z.valueOf(m).square())));
      }
      mN = mN.add(1);
    }
    return mA.pollFirst();
  }
}
