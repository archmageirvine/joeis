package irvine.oeis.a007;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence0;

/**
 * A007273 Inverse of 1155th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A007273 extends Sequence0 {

  private final int mN;
  private Polynomial<Z> mA = null;
  private int mM = -1;

  protected A007273(final int n) {
    mN = n;
  }

  /** Construct the sequence. */
  public A007273() {
    this(1155);
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Cyclotomic.inverse(mN);
    }
    if (++mM > mA.degree()) {
      mM = 0;
    }
    return mA.coeff(mM);
  }
}
