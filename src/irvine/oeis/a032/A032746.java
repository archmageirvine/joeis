package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032746 <code>Super-6</code> Numbers <code>(6 x n^6</code> contains substring <code>'666666'</code> in its decimal expansion).
 * @author Sean A. Irvine
 */
public class A032746 implements Sequence {

  private long mN = 27256;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).pow(6).multiply(6).toString().contains("666666")) {
        return Z.valueOf(mN);
      }
    }
  }
}
