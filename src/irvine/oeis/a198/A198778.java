package irvine.oeis.a198;

import irvine.oeis.PrependSequence;
import irvine.oeis.a001.A001620;
import irvine.oeis.a103.A103812;

/**
 * A198778 Primes from merging of 4 successive digits in decimal expansion of Euler-Mascheroni constant A001620.
 * @author Georg Fischer
 */
public class A198778 extends PrependSequence {

  /** Construct the sequence. */
  public A198778() {
    super(new A103812(new A001620(), 4, 0), 577); // bad workaround since gamma = 0.5772...
  }
}
