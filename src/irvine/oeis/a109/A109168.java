package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A109168 Continued fraction expansion of the constant x (A109169) such that the continued fraction of 2*x yields the continued fraction of x interleaved with the positive even numbers.
 * a(n) = n - (n AND n-1)/2
 * @author Georg Fischer
 */
public class A109168 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z n1 = mN;
    mN = mN.add(1);
    return mN.subtract(mN.and(n1).divide2());
  }
}
