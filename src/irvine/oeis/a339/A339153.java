package irvine.oeis.a339;

import irvine.oeis.transform.EulerTransform;

/**
 * A339153 Number of nonequivalent series-parallel networks with n elements and without unit elements in parallel.
 * @author Gregory Morse
 */
public class A339153 extends EulerTransform {
  /** Construct the sequence. */
  public A339153() {
    super(1, new A339152());
  }
}
