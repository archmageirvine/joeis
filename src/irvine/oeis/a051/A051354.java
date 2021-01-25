package irvine.oeis.a051;
// manually 2021-01-24

import irvine.math.z.Z;
import irvine.oeis.a027.A027672;

/**
 * A051354 Expansion of Molien series for 16-dimensional complex Clifford group of genus 4 and order 97029351014400.
 * @author Georg Fischer
 */
public class A051354 extends A027672 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if ((mN & 1) == 1) {
      super.next();
      ++mN;
    }
    return super.next();
  }

}
