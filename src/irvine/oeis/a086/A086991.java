package irvine.oeis.a086;

import irvine.oeis.a022.A022562;
import irvine.oeis.transform.EulerTransform;

/**
 * A086991 Numbers of claw-free simple graphs (not necessarily connected) on n nodes.
 * @author Sean A. Irvine
 */
public class A086991 extends EulerTransform {

  /** Construct the sequence. */
  public A086991() {
    super(1, new A022562());
  }
}
