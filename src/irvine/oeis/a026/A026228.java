package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026228 Numbers k such that A026166(k) = A026136(k) - 1.
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
