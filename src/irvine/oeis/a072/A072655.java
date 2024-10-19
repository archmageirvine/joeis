package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A072642.
 * @author Sean A. Irvine
 */
public class A072655 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A072655() {
    super(0, new A072654(), v -> Z.valueOf(v.bitLength()));
  }
}
