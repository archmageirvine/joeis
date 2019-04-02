package irvine.oeis.a011;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.FiniteSequence;

/**
 * A011632 28th cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A011632 extends FiniteSequence {

  private static Z[] build(final int n) {
    final Polynomial<Z> poly = Cyclotomic.cyclotomic(n);
    return poly.toArray(new Z[poly.size()]);
  }

  protected A011632(final int row) {
    super(build(row));
  }

  /** Construct the sequence. */
  public A011632() {
    this(28);
  }
}
