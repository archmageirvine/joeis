package irvine.oeis.a037;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037137 Numbers n such that A037134(n) = A037135(n) &gt; 0.
 * @author Sean A. Irvine
 */
public class A037137 implements Sequence {

  private final Sequence mA = new A037134();
  private final Sequence mB = new A037135();
  private long mN = 0;


  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z a = mA.next();
      if (a.equals(mB.next()) && a.signum() > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
