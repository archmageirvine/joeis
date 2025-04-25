package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A076968 a(n) = sqrt(A076967(n)).
 * @author Sean A. Irvine
 */
public class A076968 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A076968() {
    super(1, new A076967(), Z::sqrt);
  }
}

