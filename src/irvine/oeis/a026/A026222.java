package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026222 Numbers k such that A026136(k) = A026142(k).
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
