package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.a002.A002997;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A080910.
 * @author Sean A. Irvine
 */
public class A389338 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A389338() {
    super(1, new A002997(), k -> k.mod(Z.TEN));
  }
}

