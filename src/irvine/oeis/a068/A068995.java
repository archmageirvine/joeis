package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a014.A014824;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A068995 Integer parts of the square roots of the schizophrenic numbers (A014824).
 * @author Sean A. Irvine
 */
public class A068995 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A068995() {
    super(1, new A014824().skip(), Z::sqrt);
  }
}
