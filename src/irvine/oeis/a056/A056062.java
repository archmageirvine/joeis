package irvine.oeis.a056;

import irvine.oeis.RunLengthSequence;
import irvine.oeis.a030.A030190;

/**
 * A056062 Run lengths in infinite binary Champernowne string (A030190) formed by concatenation of 0, 1, 2 ... in base 2.
 * @author Sean A. Irvine
 */
public class A056062 extends RunLengthSequence {

  /** Construct the sequence. */
  public A056062() {
    super(new A030190());
  }
}
