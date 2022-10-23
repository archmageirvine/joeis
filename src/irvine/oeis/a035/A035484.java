package irvine.oeis.a035;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A035484 Numbers n such that fractional part of e^(Pi*sqrt(n)) &gt; 0.99.
 * @author Sean A. Irvine
 */
public class A035484 extends Sequence1 {

  private static final CR C99 = CR.valueOf(new Q(99, 100));
  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      if (CR.valueOf(++mN).sqrt().multiply(CR.PI).exp().frac().compareTo(C99) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

