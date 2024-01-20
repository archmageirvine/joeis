package irvine.oeis.a026;

import irvine.oeis.transform.RunLengthTransform;

/**
 * A026497 a(n) = length of n-th run of identical symbols in A026492.
 * @author Sean A. Irvine
 */
public class A026497 extends RunLengthTransform {

  /** Construct the sequence. */
  public A026497() {
    super(1, new A026492());
  }
}
