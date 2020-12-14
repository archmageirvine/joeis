package irvine.oeis.a037;

import irvine.factor.factor.Cheetah;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037164 Numerators of coefficients of Eisenstein series E_12(q) (or E_6(q) or E_24(q)).
 * @author Sean A. Irvine
 */
public class A037164 implements Sequence {

  private static final Q C = new Q(65520, 691); // (2*12)/B_{12}
  private long mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : C.multiply(Cheetah.factor(mN).sigma(11)).num();
  }
}
