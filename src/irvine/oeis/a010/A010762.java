package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010762 a(n) = floor( n/2 ) * floor( n/3 ).
 * @author Sean A. Irvine
 */
public class A010762 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.valueOf(mN / 2).multiply(mN / 3);
  }
}
