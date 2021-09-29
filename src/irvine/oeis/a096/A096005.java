package irvine.oeis.a096;
// manually diffseq at 2021-09-27 19:03

import irvine.math.z.Z;
import irvine.oeis.DifferenceSequence;
import irvine.oeis.a002.A002387;

/**
 * A096005 For k &gt;= 1, let b(k) = ceiling( Sum_{i=1..k} 1/i ); a(n) = number of b(k) that are equal to n.
 * @author Georg Fischer
 */
public class A096005 extends DifferenceSequence {

  protected long mN = -1;

  /** Construct the sequence. */
  public A096005() {
    super(new A002387());
  }

  @Override
  public Z next() {
    ++mN;
    return mN == 0 ? Z.ZERO : super.next();
  }
}
