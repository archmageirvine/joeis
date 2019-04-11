package irvine.oeis.a007;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a000.A000096;

/**
 * A007401 Add <code>n-1</code> to n-th term of 'n appears n times' sequence (A002024).
 * @author Sean A. Irvine
 */
public class A007401 extends ComplementSequence {

  /** Construct the sequence. */
  public A007401() {
    super(new A000096());
  }
}
