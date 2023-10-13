package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a245.A245530;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A066398.
 * @author Sean A. Irvine
 */
public class A066401 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A066401() {
    super(1, new A245530(), Z::sqrt);
  }
}
