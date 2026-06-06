package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A085189 Terms of A085190 halved.
 * @author Sean A. Irvine
 */
public class A085189 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A085189() {
    super(0, new A085190(), Z::divide2);
  }
}
