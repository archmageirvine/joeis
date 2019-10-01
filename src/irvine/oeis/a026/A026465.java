package irvine.oeis.a026;

import irvine.oeis.RunLengthSequence;
import irvine.oeis.a001.A001285;

/**
 * A026465 Length of n-th run of identical symbols in the Thue-Morse sequence <code>A010060</code> (or <code>A001285)</code>.
 * @author Sean A. Irvine
 */
public class A026465 extends RunLengthSequence {

  /** Construct the sequence. */
  public A026465() {
    super(new A001285());
  }
}
