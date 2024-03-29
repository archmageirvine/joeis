package irvine.oeis.a331;
// Generated by gen_seq4.pl rgs/rgs2 at 2023-12-08 20:56

import irvine.oeis.a009.A009194;
import irvine.oeis.a323.A323901;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A331744 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A009194(i) = A009194(j) and A323901(i) = A323901(j) for all i, j.
 * @author Georg Fischer
 */
public class A331744 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A331744() {
    super(1, new A009194(), new A323901().skip(1));
  }
}
