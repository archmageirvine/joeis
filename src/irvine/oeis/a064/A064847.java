package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.recur.ConstantOrderRecurrence;

/**
 * A064847 Sequence a(n) such that there is a sequence b(n) with a(1) = b(1) = 1, a(n+1) = a(n) * b(n) and  b(n+1) = a(n) + b(n) for n &gt;= 1.
 * @author Georg Fischer
 */
public class A064847 extends ConstantOrderRecurrence {

  /** Construct the sequence. */
  public A064847() {
    super(1, 2, 0, 1, 1);
  }

  // Maple: f:= proc(n) option remember; procname(n-1)*(procname(n-1)/procname(n-2) + procname(n-2)) end proc: f(1):= 1: f(2):= 1:
  @Override
  public Z compute(final int n) {
    return a(n - 1).multiply(a(n - 1).divide(a(n - 2)).add(a(n - 2)));
  }
}
