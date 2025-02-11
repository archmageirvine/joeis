package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075169.
 * @author Sean A. Irvine
 */
public class A075179 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075179() {
    super(new A075178(), Z::divide2);
  }
}
