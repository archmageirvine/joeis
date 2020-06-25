package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032748 <code>Super-8</code> Numbers <code>(8 x n^8</code> contains substring <code>'88888888'</code> in its decimal expansion).
 * @author Sean A. Irvine
 */
public class A032748 implements Sequence {

  private long mN = 185422;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).pow(8).shiftLeft(3).toString().contains("88888888")) {
        return Z.valueOf(mN);
      }
    }
  }
}
