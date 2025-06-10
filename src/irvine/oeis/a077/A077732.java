package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077732 a(n) = A077731(n)^(1/2).
 * @author Sean A. Irvine
 */
public class A077732 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077732() {
    super(new A077731(), Z::sqrt);
  }
}
