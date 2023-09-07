package irvine.oeis.a230;

import java.util.TreeSet;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.AbstractSequence;

/**
 * A230798 The number of distinct coefficients in the n-th cyclotomic polynomial.
 * @author Georg Fischer
 */
public class A230798 extends AbstractSequence {

  private int mN;
  private final TreeSet<Z> mSet = new TreeSet<>();

  /** Construct the sequence. */
  public A230798() {
    super(1);
    mN = 0;
  }

  @Override
  public Z next() {
    final Polynomial<Z> cyclo = Cyclotomic.cyclotomic(++mN);
    mSet.clear();
    for (int icoeff = cyclo.degree(); icoeff >= 0; --icoeff) {
      mSet.add(cyclo.coeff(icoeff));
    }
    return Z.valueOf(mSet.size());
  }
}
