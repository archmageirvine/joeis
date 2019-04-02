package irvine.oeis.a238;

import irvine.math.z.Z;
import irvine.oeis.a269.A269920;

/**
 * A238355 Number of rooted maps of genus 5 containing n edges.
 * @author Sean A. Irvine
 */
public class A238355 extends A269920 {

  private int mN = 9;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN + 1; ++k) {
      sum = sum.add(get(mN, 5, k));
    }
    return sum;
  }
}
