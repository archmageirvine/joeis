package irvine.oeis.a061;

import irvine.oeis.a000.A000203;
import irvine.oeis.transform.EulerTransform;

/**
 * A061256 Euler transform of sigma(n), cf. A000203.
 * @author Sean A. Irvine
 */
public class A061256 extends EulerTransform {

  /** Construct the sequence. */
  public A061256() {
    super(0, new A000203(), 1);
  }
}
