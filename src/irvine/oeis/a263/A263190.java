package irvine.oeis.a263;

import java.util.ArrayList;

import irvine.math.cr.CR;
import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A263190 G.f. satisfies: [x^(n-1)] A(x)^(n^2) = (n!)^2 for n&gt;=1.
 * @author Sean A. Irvine
 */
public class A263190 implements Sequence {

private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private final ArrayList<Z> mA = new ArrayList<>();
  private int mN = 0;
  private Z mF = Z.FOUR;

  @Override
  public Z next() {
    final Z oldf = mF;
    final int m = mN;
    if (++mN <= 2) {
      mA.add(Z.ONE);
    } else {
      final int n2 = mN * mN;
      mF = mF.multiply(n2);
      final Polynomial<Z> p = RING.create(mA);
      final Polynomial<Z> pp = RING.pow(p, n2, m);
      final Z t = mF.subtract(pp.coeff(m)).divide(n2);
      mA.add(t);
    }
    final Z z = mA.get(m);
    if (mVerbose) {
      System.out.println("a(" + m + ")/(" + m + "!)^2 = " + CR.valueOf(z).divide(CR.valueOf(oldf)));
    }
    return z;
  }
}
