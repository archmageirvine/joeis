package irvine.oeis.a300;
// Generated by gen_seq4.pl rgs/rgs2 at 2023-10-24 18:46

import irvine.oeis.a003.A003415;
import irvine.oeis.a046.A046523;
import irvine.oeis.transform.RestrictedGrowthTransformSequence;

/**
 * A300249 Filter sequence combining A003415(n) and A046523(n), the arithmetic derivative of n and the prime signature of n.
 * @author Georg Fischer
 */
public class A300249 extends RestrictedGrowthTransformSequence {

  /** Construct the sequence. */
  public A300249() {
    super(1, new A003415().skip(1), new A046523());
  }
}
