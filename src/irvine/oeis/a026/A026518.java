package irvine.oeis.a026;

import irvine.oeis.transform.RunLengthTransform;

/**
 * A026518 a(n) = length of n-th run of identical symbols in A026517.
 * @author Sean A. Irvine
 */
public class A026518 extends RunLengthTransform {

  /** Construct the sequence. */
  public A026518() {
    super(1, new A026517());
  }
}
