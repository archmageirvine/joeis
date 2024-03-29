package irvine.oeis.a322;
// Generated by gen_seq4.pl rgs/rgs2 at 2023-10-24 18:46

import irvine.oeis.a046.A046523;
import irvine.oeis.a048.A048250;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A322021 Lexicographically earliest such sequence a that a(i) = a(j) =&gt; A046523(i) = A046523(j) and A048250(i) = A048250(j), for all i, j.
 * @author Georg Fischer
 */
public class A322021 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A322021() {
    super(1, new A046523(), new A048250());
  }
}
