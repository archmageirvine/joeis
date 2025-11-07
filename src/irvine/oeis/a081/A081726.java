package irvine.oeis.a081;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081726 Let f(x,y)=floor((1+1/y)^x); sequence gives least k such that f(k+2,n)/f(k,n)=(1+1/n)^2.
 * @author Sean A. Irvine
 */
public class A081726 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Q f = new Q(++mN + 1, mN);
    final Q f2 = f.square();
    Q fk = f;
    long k = 0;
    while (true) {
      ++k;
      if (new Q(fk.multiply(f2).toZ(), fk.toZ()).equals(f2)) {
        return Z.valueOf(k);
      }
      fk = fk.multiply(f);
    }
  }
}
