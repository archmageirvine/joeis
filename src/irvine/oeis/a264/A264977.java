package irvine.oeis.a264;
// Generated by gen_seq4.pl dirtraf at 2024-01-19 19:49

import irvine.oeis.a048.A048675;
import irvine.oeis.a277.A277330;
import irvine.oeis.transform.DirectTransformSequence;

/**
 * A264977 a(0) = 0, a(1) = 1, a(2*n) = 2*a(n), a(2*n+1) = a(n) XOR a(n+1).
 * @author Georg Fischer
 */
public class A264977 extends DirectTransformSequence {

  /** Construct the sequence. */
  public A264977() {
    super(0, new A048675(), new A277330());
  }
}
