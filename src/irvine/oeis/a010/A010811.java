package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010811 23rd powers: a(n) = n^23.
 * @author Sean A. Irvine
 */
public class A010811 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(23);
  }
}
