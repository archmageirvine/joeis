package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079672 Numbers of the form (3^s+1)/(3^r+1) for s &gt; 1, 1 &lt;= r &lt;= s-1.
 * @author Sean A. Irvine
 */
public class A079672 extends Sequence1 {

  private long mN = 2;
  private long mM = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mM >= mN) {
        ++mN;
        mM = 1;
      }
      final Z[] qr = Z.THREE.pow(mN).add(1).divideAndRemainder(Z.THREE.pow(mM).add(1));
      if (qr[1].isZero()) {
        return qr[0];
      }
    }
  }
}

