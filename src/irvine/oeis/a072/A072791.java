package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A072791 Binary widths of A072790.
 * @author Sean A. Irvine
 */
public class A072791 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A072791() {
    super(0, new A072790(), v -> Z.valueOf(v.bitLength()));
  }
}
