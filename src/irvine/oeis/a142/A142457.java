package irvine.oeis.a142;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A142457 A triangular sequence "representation" of the modulo 11 Integer field: t(+)(n,m)=Mod[n + m, 11]; t(x)(n,m)=Mod[n*m, 11]; t(n,m)=Mod[t(=)(n,m)*t(X)(n,m),11].
 * @author Sean A. Irvine
 */
public class A142457 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf((((mN * mM) % 11) * (mN + mM)) % 11);
  }
}

