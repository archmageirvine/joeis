package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026228 n-th number k such that <code>t(k) = s(k) - 1</code>, where s <code>= A026136, t = A026166</code>.
 * @author Sean A. Irvine
 */
public class A026228 extends A026136 {

  private final Sequence mS = new A026166();
  private long mN = 0;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mS.next().equals(super.next().subtract(1)));
    return Z.valueOf(mN);
  }
}
