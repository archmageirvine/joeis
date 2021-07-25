package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026224 Numbers k such that t(k) = s(k) + 1, where s = A026136, t = A026142.
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
