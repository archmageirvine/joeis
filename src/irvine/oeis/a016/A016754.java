package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.recur.LinearRecurrence;

/**
 * A016754 Odd squares: a(n) = (2n+1)^2. Also centered octagonal numbers.
 * @author Sean A. Irvine
 */
public class A016754 extends LinearRecurrence implements DirectSequence {

  /** Construct the sequence. */
  public A016754() {
    super(new long[] {1, -3, 3}, new long[] {1, 9, 25});
  }

  @Override
  public Z a(final Z n) {
    return Z.FOUR.multiply(n).multiply(n.add(1)).add(1);
  }

  @Override
  public Z a(final long n) {
    // a(n) = 4*n*(n + 1) + 1 
    return Z.valueOf(4 * n).multiply(n + 1).add(1);
  }

}
