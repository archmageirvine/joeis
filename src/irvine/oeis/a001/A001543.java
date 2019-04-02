package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001543 a(0) = 1, a(n) = 5 + Product_{i=0..n-1} a(i) for n &gt; 0.
 * @author Sean A. Irvine
 */
public class A001543 implements Sequence {

  private Z mP = Z.ZERO;

  @Override
  public Z next() {
    if (Z.ZERO.equals(mP)) {
      mP = Z.ONE;
      return Z.ONE;
    }
    final Z t = mP.add(5);
    mP = mP.multiply(t);
    return t;
  }
}
