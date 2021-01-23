package irvine.oeis.a034;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a000.A000079;

/**
 * A034899 Euler transform of powers of 2 [ 2,4,8,16,... ].
 * @author Sean A. Irvine
 */
public class A034899 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A034899() {
    super(new A000079(), 1);
  }
}
