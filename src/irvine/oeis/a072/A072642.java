package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A072642 Binary widths of the terms of A072640.
 * @author Sean A. Irvine
 */
public class A072642 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A072642() {
    super(0, new A072640(), v -> Z.valueOf(v.bitLength()));
  }
}
