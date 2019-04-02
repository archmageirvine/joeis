package irvine.oeis.a215;

import irvine.math.z.Z;
import irvine.oeis.a269.A269920;

/**
 * A215402 Number of rooted maps of (orientable) genus 4 containing n edges.
 * @author Sean A. Irvine
 */
public class A215402 extends A269920 {

  private int mN = 7;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN + 1; ++k) {
      sum = sum.add(get(mN, 4, k));
    }
    return sum;
  }
}
