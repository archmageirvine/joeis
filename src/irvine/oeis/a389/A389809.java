package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A389809 Sequence containing k-1 occurrences of prime(k) ordered by k.
 * @author Sean A. Irvine
 */
public class A389809 extends A000040 {

  private Z mP = super.next();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < 0) {
      mP = super.next();
      mM = ++mN;
    }
    return mP;
  }
}

