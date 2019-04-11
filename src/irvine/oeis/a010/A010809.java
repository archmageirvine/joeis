package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A010809 21st powers: <code>a(n) = n^21</code>.
 * @author Sean A. Irvine
 */
public class A010809 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(++mN).pow(21);
  }
}
