package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071674 Sequence A071673 reduced modulo 2.
 * @author Sean A. Irvine
 */
public class A071674 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071674() {
    super(new A071673(), k -> k.and(Z.ONE));
  }
}
