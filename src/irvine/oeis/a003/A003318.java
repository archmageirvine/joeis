package irvine.oeis.a003;

import irvine.oeis.PartialSumSequence;

/**
 * A003318 <code>a(n + 1) = 1 + a( floor(n/1) ) + a( floor(n/2) ) + ... + a( floor(n/n) )</code>.
 * @author Sean A. Irvine
 */
public class A003318 extends PartialSumSequence {

  /** Construct the sequence. */
  public A003318() {
    super(new A003238());
  }
}
