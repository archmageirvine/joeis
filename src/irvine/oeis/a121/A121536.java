package irvine.oeis.a121;
// manually 2026-09-09/sintrif at 2026-09-09 22: 27

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.PrependSequence;
import irvine.oeis.a070.A070923;
import irvine.oeis.transform.SingleTransformSequence;

/**
 * A121536 Smallest m such that m^3 &gt;= n^2.
 * @author Georg Fischer
 */
public class A121536 extends PrependSequence {

  /** Construct the sequence. */
  public A121536() {
    super(1, new SingleTransformSequence(1, (term, n) -> Functions.CBRT.z(term.add(Z.valueOf(n).square())), "", new A070923()), 0);
  }
}
