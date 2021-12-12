package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A007719 Number of independent polynomial invariants of symmetric matrix of order n.
 * @author Sean A. Irvine
 */
public class A007719 extends InverseEulerTransform {

  /** Construct the sequence. */
  public A007719() {
    super(new A007717(), 1, Z.ONE);
  }
}
