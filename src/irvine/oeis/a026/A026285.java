package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026285 a(n) = least k such that s(k) = n, where s = A026284.
 * @author Sean A. Irvine
 */
public class A026285 extends InverseSequence {

  /** Construct the sequence. */
  public A026285() {
    super(new A026284());
  }
}
