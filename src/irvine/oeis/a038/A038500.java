package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038500 Highest power of 3 dividing n.
 * @author Sean A. Irvine
 */
public class A038500 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    int c = 0;
    long m = ++mN;
    while (m % 3 == 0) {
      ++c;
      m /= 3;
    }
    return Z.THREE.pow(c);
  }
}
