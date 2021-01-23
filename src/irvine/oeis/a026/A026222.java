package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026222 a(n) = n-th number k such that s(k)=t(k), where s = A026136, t = A026142.
 * @author Sean A. Irvine
 */
public class A026222 extends A026136 {

  private final Sequence mS = new A026142();
  private long mN = 0;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mS.next().equals(super.next()));
    return Z.valueOf(mN);
  }
}
