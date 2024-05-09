package irvine.oeis.a182;

import irvine.oeis.FilterSequence;
import irvine.oeis.a003.A003336;

/**
 * A182277 Quartan semiprimes: semiprimes of the form x^4 + y^4, x&gt;0, y&gt;0.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A182277 extends FilterSequence {

  /** Construct the sequence. */
  public A182277() {
    super(1, new A003336(), SEMIPRIME);
  }
}
