package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.a092.A092315;

/**
 * A056053 a(n) = smallest odd number 2m+1 such that the partial sum of the odd harmonic series Sum_{j=0..m} 1/(2j+1) is &gt; n.
 * @author Sean A. Irvine
 */
public class A056053 extends A092315 implements Conjectural {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    return super.next().multiply2().add(1);
  }
}
