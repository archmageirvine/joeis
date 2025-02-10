package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A074598.
 * @author Sean A. Irvine
 */
public class A075160 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075160() {
    super(1, new A075158(), Z.ONE::add);
  }
}
