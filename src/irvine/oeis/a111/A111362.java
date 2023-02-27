package irvine.oeis.a111;

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A111362 Sequence defined by an recurrence.
 * Recurrence: a(1)=1, a(2)= 2, a(3)=3, a(4)=4, a(n)=5a(n-1)+3a(n-2)+2a(n-3)+a(n-4) (modulo 10).
 * @author Georg Fischer
 */
public class A111362 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A111362() {
    super(1, 4, 0, 1, 2, 3, 4);
  }

  @Override
  protected Z compute(final int n) {
    return a(n - 1).multiply(5).add(a(n - 2).multiply(3)).add(a(n - 3).multiply2()).add(a(n - 4)).mod(Z.TEN);
  }
}
