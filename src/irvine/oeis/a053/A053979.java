package irvine.oeis.a053;

import java.util.ArrayList;
import java.util.List;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053979 Triangle T(n,k) giving number of rooted maps regardless of genus with n edges and k nodes (n &gt;= 0, k = 1..n+1).
 * @author Sean A. Irvine
 */
public class A053979 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> X1 = Polynomial.create(1, 1);
  private int mM = 0;
  private final List<Polynomial<Z>> mR = new ArrayList<>();
  private final List<Polynomial<Z>> mS = new ArrayList<>();
  {
    mR.add(RING.x());
    mS.add(RING.x());
  }

  @Override
  public Z next() {
    final int n = mS.size();
    if (++mM > mS.get(n - 1).degree()) {
      Polynomial<Z> sum = RING.substitute(mS.get(n - 1), X1, Integer.MAX_VALUE).shift(1);
      mR.add(sum);
      for (int k = 0; k < n; ++k) {
        sum = RING.add(sum, RING.multiply(mR.get(k), mS.get(n - 1 - k)));
      }
      mS.add(sum);
      mM = 1;
    }
    return mR.get(mS.size() - 1).coeff(mM);
  }
}
