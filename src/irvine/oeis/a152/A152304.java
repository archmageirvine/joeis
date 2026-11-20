package irvine.oeis.a152;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A152304 Marsaglia-Zaman type binet solution rationalized: f(n)=(11/20 - Sqrt[512]/20)^n/3 + (2/3)*(11/20 + Sqrt[512]/20)^n; a(n)=Mod[Floor[f(n)],10].
 * @author Sean A. Irvine
 */
public class A152304 extends Sequence0 {

  private static final CR R = CR.valueOf(32).sqrt().divide(5);
  private static final CR C = CR.valueOf(new Q(11, 20));
  private static final CR TWO_THIRDS = CR.valueOf(new Q(2, 3));
  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    return C.subtract(R).pow(mN).divide(3).add(C.add(R).pow(mN).multiply(TWO_THIRDS)).floor().mod(Z.TEN);
  }
}

