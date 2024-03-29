package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A010809 21st powers: a(n) = n^21.
 * @author Sean A. Irvine
 */
public class A010809 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(21);
  }
}
