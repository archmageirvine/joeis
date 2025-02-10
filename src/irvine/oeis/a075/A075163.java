package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A075163 Position of A075165(n) in A014486 plus one.
 * @author Sean A. Irvine
 */
public class A075163 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A075163() {
    super(1, new A075161(), Z.ONE::add);
  }
}
