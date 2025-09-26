package irvine.oeis.a080;

import irvine.oeis.InverseSequence;
import irvine.oeis.a025.A025429;

/**
 * A080654 Smallest number with exactly n representations as a sum of five positive squares or 0 if no such number exists (cf. A025429).
 * @author Sean A. Irvine
 */
public class A080654 extends InverseSequence {

  /** Construct the sequence. */
  public A080654() {
    super(1, new A025429());
  }
}
