package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a014.A014486;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A072642.
 * @author Sean A. Irvine
 */
public class A072643 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A072643() {
    super(0, new A014486(), v -> Z.valueOf(v.bitLength() / 2));
  }
}
