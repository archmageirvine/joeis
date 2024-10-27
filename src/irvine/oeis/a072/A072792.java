package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A072792 Triangle A072789 computed modulo 2.
 * @author Sean A. Irvine
 */
public class A072792 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A072792() {
    super(0, new A072789(), Z.ONE::and);
  }
}
