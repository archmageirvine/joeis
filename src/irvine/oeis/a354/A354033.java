package irvine.oeis.a354;
// Generated by gen_seq4.pl 2023-10-21/pairtra at 2023-10-22 21:59

import irvine.oeis.a174.A174275;
import irvine.oeis.transform.PairTransformSequence;

/**
 * A354033 a(n) = 1 if n &gt; 1 and n is a power of a prime of the form 4m+3, otherwise 0.
 * @author Georg Fischer
 */
public class A354033 extends PairTransformSequence {

  /** Construct the sequence. */
  public A354033() {
    super(1, new A174275(), new A354031(), (n, u, v) -> u.subtract(v));
  }
}
