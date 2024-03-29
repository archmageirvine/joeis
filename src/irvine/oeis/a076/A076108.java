package irvine.oeis.a076;
// Generated by gen_seq4.pl tuptraf/simtraf at 2023-10-28 00:07

import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076108 Least positive n-th power that is the sum of n consecutive integers, or 0 if no such n-th power exists.
 * @author Georg Fischer
 */
public class A076108 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076108() {
    super(1, new A076109(), (n, v) -> v.pow(n));
  }
}
