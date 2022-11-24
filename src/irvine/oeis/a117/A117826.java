package irvine.oeis.a117;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A117826 First four terms of the sequence are doubled, then those numbers are tripled and then those numbers are quadrupled, etc.
 * @author Georg Fischer
 */
public class A117826 extends A000142 {

  private int mN = 0;
  private Z mA;

  /** Construct the sequence. */
  public A117826() {
    super.next();
  }

  @Override
  public int getOffset() {
    return 1;
  }

  @Override
  public Z next() {
    // a(4n-3) = A000142(n), a(4n-2)=2*A000142(n), a(4n-1)=3*A000142(n), a(4n)=4*A000142(n)
    ++mN;
    if ((mN & 3) == 1) {
      mA = super.next();
      return mA;
    }
    if ((mN & 3) == 2) {
      return mA.multiply2();
    }
    if ((mN & 3) == 3) {
      return mA.multiply(3);
    }
    return mA.multiply(4);
  }
}
