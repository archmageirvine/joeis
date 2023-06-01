package irvine.oeis.a113;
// manually binomx at 2023-06-01 10:26

import irvine.oeis.a001.A001168;
import irvine.oeis.transform.BinomialTransform;

/**
 * A113174 Number of fixed 3D piled polyominoes: polycubes with fixed orientation, with no cubes &quot;sitting on air&quot;.
 * @author Georg Fischer
 */
public class A113174 extends BinomialTransform {

  /** Construct the sequence. */
  public A113174() {
    super(1, new A001168(), 1, false);
  }
}
