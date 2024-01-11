package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067859 a(1) = 1; a(n+1) = floor(sqrt(Sum_{k=1..n} a(k)^2)).
 * @author Sean A. Irvine
 */
public class A067859 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    } else {
      final Z t = mA.sqrt();
      mA = mA.add(t.square());
      return t;
    }
  }
}
