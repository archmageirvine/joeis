package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026222 <code>a(n) = n-th</code> number k such that <code>s(k)=t(k)</code>, where s <code>= A026136, t = A026142</code>.
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
