package irvine.oeis.a230;
// manually cordrec at 2022-06-09 14:26

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A230123 Smallest number of the form 11*m+1 with exactly n prime factors, counted with multiplicity.
 * <code>a(n) = a(n-10)*2^10</code>
 * @author Georg Fischer
 */
public class A230123 extends ConstantOrderRecurrence {

  /** Construct the sequence */
  public A230123() {
    super(0, 10, 0, 1, 23, 34, 12, 56, 243, 144, 320, 2432, 1728, 1024, 17920, 20736, 12288);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 10).multiply(Z.ONE.shiftLeft(10));
  }
}
