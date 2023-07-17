package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a033.A033178;

/**
 * A038005 Odd k such that b(k) is less than b(k-1) and b(k+1). b(k): A033178.
 * @author Sean A. Irvine
 */
public class A038005 extends A033178 {

  /** Construct the sequence. */
  public A038005() {
    super(0);
  }

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if ((mN & 1) == 0 && mA.compareTo(t) < 0 && mA.compareTo(mB) < 0) {
        return Z.valueOf(mN - 1);
      }
    }
  }
}
