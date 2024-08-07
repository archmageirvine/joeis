package irvine.oeis.a256;
// Generated by gen_seq4.pl 2024-06-01/pyramidal at 2024-06-01 22:47

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A256716 a(n) = n*(n+1)*(22*n-19)/6.
 * @author Georg Fischer
 */
public class A256716 extends HolonomicRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A256716() {
    super(0, "[0,1,-4,6,-4,1]", "0,1,25", 0, 0);
  }

  @Override
  public Z a(final int n) {
    return Z.valueOf(n).multiply(n + 1).multiply(n * 22L - 19).divide(6);
  }

  @Override
  public Z a(final Z n) {
    return n.multiply(n.add(1)).multiply(n.multiply(22).subtract(19)).divide(6);
  }
}
