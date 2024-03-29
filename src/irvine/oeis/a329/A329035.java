package irvine.oeis.a329;
// Generated by gen_seq4.pl rgs/rgs1 at 2024-01-19 09:42

import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A329035 Lexicographically earliest infinite sequence such that a(i) = a(j) =&gt; A329034(i) = A329034(j) for all i, j, where A329034 is the M\u00f6bius transform of A122111.
 * @author Georg Fischer
 */
public class A329035 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A329035() {
    super(1, new A329034());
  }
}
