package irvine.oeis.a056;

import irvine.oeis.ComplementSequence;
import irvine.oeis.a278.A278373;

/**
 * A056996 Positive integers not of the form sigma(k) + phi(k) - 2k for some k.
 * @author Sean A. Irvine
 */
public class A056996 extends ComplementSequence {

  /** Construct the sequence. */
  public A056996() {
    super(new A278373());
  }
}
