package irvine.oeis.a343;

import irvine.math.dirichlet.Dgf;
import irvine.math.dirichlet.Ds;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A343322 Dirichlet g.f.: Product_{k&gt;=2} (1 + k^(-s))^(k^2).
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A343322 extends AbstractSequence {

  private int mN;

  /** Construct the sequence. */
  public A343322() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    Ds series = Dgf.one();
    for (int k = 2; k <= mN; ++k) {
      series = Dgf.multiply(series, Dgf.pow(Dgf.simple(k), Z.valueOf(k).square()));
    }
    return series.coeff(mN);
  }
}
