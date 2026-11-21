package irvine.oeis.a134;

import irvine.math.z.Z;
import irvine.oeis.a005.A005703;
import irvine.oeis.transform.EulerTransform;

/**
 * A134964 Number of unlabeled n-node simple graphs with at most one cycle in each connected component.
 * @author Gregory Morse
 */
public class A134964 extends EulerTransform {
  /** Construct the sequence. */
  public A134964() {
    super(0, new A005703().skip(1), Z.ONE);
  }
}
