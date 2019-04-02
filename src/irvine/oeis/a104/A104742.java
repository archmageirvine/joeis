package irvine.oeis.a104;

import irvine.math.z.Z;
import irvine.oeis.a269.A269920;

/**
 * A104742 Number of rooted maps of (orientable) genus 3 containing n edges.
 * @author Sean A. Irvine
 */
public class A104742 extends A269920 {

  private int mN = 5;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 0; k <= mN + 1; ++k) {
      sum = sum.add(get(mN, 3, k));
    }
    return sum;
  }
}
