package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A072750.
 * @author Sean A. Irvine
 */
public class A072776 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A072776() {
    super(1, new A072774(), k -> k.isPower() != null ? Z.valueOf(k.auxiliary()) : Z.ONE);
  }
}
