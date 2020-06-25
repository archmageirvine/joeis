package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032744 <code>Super-4</code> Numbers <code>(4 * n^4</code> contains substring <code>'4444'</code> in its decimal expansion).
 * @author Sean A. Irvine
 */
public class A032744 implements Sequence {

  private long mN = 1167;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).pow(4).shiftLeft(2).toString().contains("4444")) {
        return Z.valueOf(mN);
      }
    }
  }
}
