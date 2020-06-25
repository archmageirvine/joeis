package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032749 <code>Super-9</code> Numbers <code>(9*n^9</code> contains substring <code>'999999999'</code> in its decimal expansion).
 * @author Sean A. Irvine
 */
public class A032749 implements Sequence {

  private long mN = 17546132;

  @Override
  public Z next() {
    while (true) {
      if (Z.valueOf(++mN).pow(9).multiply(9).toString().contains("999999999")) {
        return Z.valueOf(mN);
      }
    }
  }
}
