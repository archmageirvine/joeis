package irvine.oeis.a340;

import irvine.math.z.Z;
import irvine.oeis.transform.InverseEulerTransform;

/**
 * A340025 Number of connected graphs with vertices labeled with positive integers summing to n.
 * @author Gregory Morse
 */
public class A340025 extends InverseEulerTransform {
  /** Construct the sequence. */
  public A340025() {
    super(0, new A340022(), 1, Z.ONE);
  }
}
