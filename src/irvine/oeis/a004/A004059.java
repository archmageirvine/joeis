package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.a057.A057561;

/**
 * A004059 <code>a(n)</code> gives position of first n in A057561.
 * @author Sean A. Irvine
 */
public class A004059 extends A057561 {

  private Z mN = Z.ZERO;
  private long mM = 0;

  @Override
  public Z next() {
    mN = mN.add(1);
    do {
      ++mM;
    } while (!super.next().equals(mN));
    return Z.valueOf(mM);
  }
}
