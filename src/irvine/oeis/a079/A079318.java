package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A079318 a(0) = 1; for n &gt; 0, a(n) = (3^(A000120(n)-1) + 1)/2.
 * @author Sean A. Irvine
 */
public class A079318 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.THREE.pow(Long.bitCount(mN) - 1).add(1).divide2();
  }
}
