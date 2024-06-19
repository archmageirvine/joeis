package irvine.oeis.a070;

import irvine.oeis.InverseSequence;

/**
 * A070881 Least k such that A070868(k) = n.
 * @author Sean A. Irvine
 */
public class A070881 extends InverseSequence {

  /** Construct the sequence. */
  public A070881() {
    super(1, new A070868());
  }
}
