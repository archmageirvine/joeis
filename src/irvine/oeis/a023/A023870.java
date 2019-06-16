package irvine.oeis.a023;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A023870 <code>a(n) = 1*prime(n) + 2*prime(n-1) + ... + k*prime(n+1-k)</code>, where <code>k=floor((n+1)/2)</code> and <code>prime(n)</code> is the n-th prime.
 * @author Sean A. Irvine
 */
public class A023870 extends A000040 {

  private final ArrayList<Z> mA = new ArrayList<>();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    mA.add(super.next());
    Z sum = Z.ZERO;
    for (int k = 1; k <= (mN + 1) / 2; ++k) {
      sum = sum.add(mA.get(mN - k).multiply(k));
    }
    return sum;
  }
}

