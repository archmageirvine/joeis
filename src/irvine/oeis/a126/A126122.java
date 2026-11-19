package irvine.oeis.a126;

import irvine.math.z.Z;
import irvine.oeis.a303.A303829;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A126122 Number of edge-rooted unlabeled graphs on n nodes.
 * @author Gregory Morse
 */
public class A126122 extends SimpleTransformSequence {
  /** Construct the sequence. */
  public A126122() {
    super(1, new A303829(), Z::divide2);
  }
}
