package irvine.oeis.a034;

import irvine.oeis.a000.A000079;
import irvine.oeis.transform.EulerTransform;

/**
 * A034899 Euler transform of powers of 2 [ 2,4,8,16,... ].
 * @author Sean A. Irvine
 */
public class A034899 extends EulerTransform {

  /** Construct the sequence. */
  public A034899() {
    super(0, new A000079().skip(1), 1);
  }
}
