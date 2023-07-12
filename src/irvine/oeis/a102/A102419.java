package irvine.oeis.a102;

import irvine.math.z.Z;
import irvine.oeis.a060.A060445;

/**
 * A102419 "Dropping time" in 3x+1 problem starting at n (number of steps to reach a lower number than starting value); a(1) = 0 by convention. Also called glide(n).
 * a(1) = 0 by convention. Also called glide(n).
 * @author Georg Fischer
 */
public class A102419 extends A060445 {

  private int mN = 0;

  {
    setOffset(1);
  }

  @Override
  public Z next() {
    // a(2n) = 1; a(2n+1) = A060445(n).
    ++mN;
    return ((mN & 1) == 0) ? Z.ONE : super.next();
  }
}
