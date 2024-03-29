package irvine.oeis.a295;
// Generated by gen_seq4.pl rgs/rgs2 at 2023-10-24 18:46

import irvine.oeis.a000.A000005;
import irvine.oeis.a000.A000203;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A295880 Filter combining the number of divisors (A000005) and the sum of divisors (A000203) of n.
 * @author Georg Fischer
 */
public class A295880 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A295880() {
    super(1, new A000005(), new A000203());
  }
}
