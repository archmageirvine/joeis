package irvine.oeis.a117;

import irvine.math.z.Z;
import irvine.oeis.a191.A191690;

/**
 * A117667 a(n) = n^n - n^(n-1) - n^(n-2) - n^(n-3) - ... - n^3 - n^2 - n.
 * @author Georg Fischer
 */
public class A117667 extends A191690 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().add(1);
  }
}
