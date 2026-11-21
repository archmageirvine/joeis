package irvine.oeis.a126;

import irvine.math.z.Z;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A126101 Number of connected unlabeled graphs on n nodes that are rooted at a non-cut node.
 * @author Gregory Morse
 */
public class A126101 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A126101() {
    super(0, new A126100(), 2, Z.ONE, Z.ONE);
  }
}
