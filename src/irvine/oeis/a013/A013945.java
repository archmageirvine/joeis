package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013945 Least d such that period of continued fraction for sqrt(d) contains n (n^2+2 if n odd, (n/2)^2+1 if n even).
 * @author Sean A. Irvine
 */
public class A013945 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return (++mN & 1) == 0 ? Z.valueOf(mN / 2).square().add(1) : Z.valueOf(mN).square().add(2);
  }
}
