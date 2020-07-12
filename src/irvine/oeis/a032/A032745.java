package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032745 <code>Super-5</code> Numbers <code>(5 * n^5</code> contains substring <code>'55555'</code> in its decimal expansion).
 * @author Sean A. Irvine
 */
public class A032745 implements Sequence {

  private long mN = 4601;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).pow(5).multiply(5).toString().contains("55555")) {
        return Z.valueOf(mN);
      }
    }
  }
}
