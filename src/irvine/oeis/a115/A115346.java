package irvine.oeis.a115;
// Generated by gen_seq4.pl trireluc

import irvine.oeis.a000.A000071;
import irvine.oeis.triangle.ReluctantSequence;

/**
 * A115346 Triangle read by rows: T(n,k) = Fibonacci(k+2) - 1.
 * @author Georg Fischer
 */
public class A115346 extends ReluctantSequence {

  /** Construct the sequence. */
  public A115346() {
    super(0, new A000071().skip(1));
  }
}

