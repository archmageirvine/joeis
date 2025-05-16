package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A077349 a(n) = A077347(n)^(1/2).
 * @author Sean A. Irvine
 */
public class A077349 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A077349() {
    super(1, new A077347(), Z::sqrt);
  }
}

