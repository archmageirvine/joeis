package irvine.oeis.a225;
// manually cordrec at 2022-06-09 14:26

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A225210 Least number of the form 11*m-1 with exactly n prime factors, counted with multiplicity.
 * <code>a(n) = a(n-10)*2^10</code>
 * @author Georg Fischer
 */
public class A225210 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A225210() {
    super(1, 10, 0, 43, 10, 76, 54, 32, 560, 648, 384, 1792, 7776, 4608, 10240);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 10).multiply(Z.ONE.shiftLeft(10));
  }
}
