package irvine.oeis.a358;

import irvine.math.z.Z;
import irvine.oeis.a030.A030717;

/**
 * A358424 Numbers k such that A030717(k) = 6.
 * @author Georg Fischer
 */
public class A358424 extends A030717 {

  private int mK = 0;

  @Override
  public Z next() {
    while (true) {
      ++mK;
      if (super.next().equals(Z.SIX)) {
        return Z.valueOf(mK);
      }
    }
  }
}
