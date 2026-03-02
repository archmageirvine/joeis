package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A084005 a(n) = sqrt(A084004(n)).
 * @author Sean A. Irvine
 */
public class A084005 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A084005() {
    super(1, new A084004(), Z::sqrt);
  }
}
