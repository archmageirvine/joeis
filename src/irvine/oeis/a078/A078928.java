package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A078928 Smallest p for which there are exactly n primitive Pythagorean triangles with perimeter p; i.e., smallest p such that A070109(p) = n.
 * @author Sean A. Irvine
 */
public class A078928 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A078928() {
    super(1, new A078927(), Z::multiply2);
  }
}
