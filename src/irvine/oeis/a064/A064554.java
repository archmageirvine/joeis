package irvine.oeis.a064;

import irvine.oeis.InverseSequence;

/**
 * A064554 a(n) = Min {k | A064553(k) = n}.
 * @author Sean A. Irvine
 */
public class A064554 extends InverseSequence {

  /** Construct the sequence. */
  public A064554() {
    super(1, new A064553());
  }
}
