package irvine.oeis.a325;
// Generated by gen_seq4.pl rgs/rgs2 at 2023-10-24 18:46

import irvine.oeis.a048.A048250;
import irvine.oeis.a126.A126795;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A325381 Lexicographically earliest sequence such that a(i) = a(j) =&gt; A048250(i) = A048250(j) and A126795(i) = A126795(j) for all i, j.
 * @author Georg Fischer
 */
public class A325381 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A325381() {
    super(1, new A048250(), new A126795());
  }
}
