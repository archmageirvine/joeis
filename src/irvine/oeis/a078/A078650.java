package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.a000.A000002;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078650 2-A000002(n) where A000002 is the Kolakoski sequence.
 * @author Sean A. Irvine
 */
public class A078650 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A078650() {
    super(1, new A000002(), Z.TWO::subtract);
  }
}
