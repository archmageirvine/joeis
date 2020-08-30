package irvine.oeis.a034;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.a000.A000079;

/**
 * A034691 Euler transform of powers of 2 [1,2,4,8,16,...].
 * @author Sean A. Irvine
 */
public class A034691 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A034691() {
    super(new A000079(), 0);
  }
}
