package irvine.oeis.a090;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A090210 Triangle of certain generalized Bell numbers.
 * @author Sean A. Irvine
 */
public class A090210 extends AbstractSequence {

  private int mN = 0;
  private int mM = 0;

  protected A090210(final int offset) {
    super(offset);
  }

  /** Construct the sequence. */
  public A090210() {
    this(1);
  }

  private Z fallfac(final int n, final int m) {
    return Functions.FACTORIAL.z(n).divide(Functions.FACTORIAL.z(n - m));
  }

  private Z s2(final int m, final int k, final int p) {
    final Z sum = Integers.SINGLETON.sum(m, p, r -> Z.NEG_ONE.pow(r).multiply(Binomial.binomial(p, r)).multiply(fallfac(r, m).pow(k)))
      .multiply(Z.NEG_ONE.pow(p));
    final Z den = Functions.FACTORIAL.z(p);
    return sum.divide(den);
  }

  protected Z bell(final int m, final int k) {
    return k == 0 ? Z.ONE : Integers.SINGLETON.sum(m, m * k, p -> s2(m, k, p));
  }

  protected Z t(final int n, final int m) {
    return bell(m, n - (m - 1));
  }

  @Override
  public Z next() {
    if (++mM > mN + 1) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}

