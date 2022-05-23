package irvine.oeis.a026;

import irvine.oeis.InverseSequence;

/**
 * A026178 a(n) is the position of n in A026177.
 * @author Sean A. Irvine
 */
public class A026178 extends InverseSequence {

  /** Construct the sequence. */
  public A026178() {
    super(new A026177());
  }
}
