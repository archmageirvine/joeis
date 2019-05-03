package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013945 Least d such that period of continued fraction for <code>sqrt(d)</code> contains <code>n (n^2+2</code> if n odd, <code>(n/2)^2+1</code> if <code>n even)</code>.
 * @author Sean A. Irvine
 */
public class A013945 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return (++mN & 1) == 0 ? Z.valueOf(mN / 2).square().add(1) : Z.valueOf(mN).square().add(2);
  }
}
