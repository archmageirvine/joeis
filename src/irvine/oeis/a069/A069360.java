package irvine.oeis.a069;
// manually 2024-03-25/filter at 2024-03-26 08:34

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002375;

/**
 * A069360 Number of prime pairs (p,q), p &lt;= q, such that (p+q)/2 = 2*n.
 * @author Georg Fischer
 */
public class A069360 extends FilterSequence {

  private int mN = 0;

  /** Construct the sequence. */
  public A069360() {
    super(1, new A002375(), (k, v) -> (k & 1) == 0);
  }

  @Override
  public Z next() {
    final Z result = super.next();
    return (++mN == 1) ? Z.ONE : result;
  }
}
