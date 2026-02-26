package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A083932 A014486-encoding of the Catalan mountain ranges with only even-length slopes allowed.
 * @author Sean A. Irvine
 */
public class A083932 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A083932() {
    super(0, new A083931(), Z.THREE::multiply);
  }
}
