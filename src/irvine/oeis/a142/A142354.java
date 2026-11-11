package irvine.oeis.a142;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A142354 A triangular sequence "representation" of the modulo 10 Integer field: t(+)(n,m)=Mod[n + m, 10]; t(x)(n,m)=Mod[n*m, 10]; t(n,m)=Mod[t(=)(n,m)*t(X)(n,m),10].
 * @author Sean A. Irvine
 */
public class A142354 extends Sequence1 {

  private long mN = 0;
  private long mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf((((mN * mM) % 10) * (mN + mM)) % 10);
  }
}

