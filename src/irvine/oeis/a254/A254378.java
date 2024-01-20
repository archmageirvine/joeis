package irvine.oeis.a254;
// manually 2022-07-01

import irvine.oeis.a228.A228495;
import irvine.oeis.transform.RunLengthTransform;

/**
 * A254378 Run lengths of A228495 (Characteristic function of the odd odious numbers).
 * @author Georg Fischer
 */
public class A254378 extends RunLengthTransform {

  /** Construct the sequence. */
  public A254378() {
    super(1, new A228495());
  }
}
