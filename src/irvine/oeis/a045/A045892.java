package irvine.oeis.a045;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A045892 Solutions s to the equation 1=s*prime(n)+t*prime(n+1).
 * @author Sean A. Irvine
 */
public class A045892 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    final Z q = mP;
    mP = super.next();
    System.out.println(Arrays.toString(q.extendedGcd(mP)));
    return q.extendedGcd(mP)[1];
  }
}
