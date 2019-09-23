package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026224 Numbers n such that <code>t(n) = s(n) + 1</code>, where s <code>= A026136, t = A026142</code>.
 * @author Sean A. Irvine
 */
public class A026224 extends A026136 {

  private final Sequence mS = new A026142();
  private long mN = 0;

  @Override
  public Z next() {
    do {
      ++mN;
    } while (!mS.next().equals(super.next().add(1)));
    return Z.valueOf(mN);
  }
}
