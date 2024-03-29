package irvine.oeis.a193;
// Generated by gen_seq4.pl 2023-12-27/dirtraf at 2023-12-27 22:04

import irvine.oeis.a008.A008472;
import irvine.oeis.a146.A146076;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A193526 Sum of even divisors of sopf(n).
 * @author Georg Fischer
 */
public class A193526 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A193526() {
    super(1, new A146076(), new A008472());
  }
}
