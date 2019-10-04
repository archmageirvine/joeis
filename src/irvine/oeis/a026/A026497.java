package irvine.oeis.a026;

import irvine.oeis.RunLengthSequence;

/**
 * A026497 <code>a(n) =</code> length of n-th run of identical symbols in <code>A026492</code>.
 * @author Sean A. Irvine
 */
public class A026497 extends RunLengthSequence {

  /** Construct the sequence. */
  public A026497() {
    super(new A026492());
  }
}
