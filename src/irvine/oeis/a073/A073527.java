package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A073500.
 * @author Sean A. Irvine
 */
public class A073527 extends ComplementSequence {

  /** Construct the sequence. */
  public A073527() {
    super(1, new A073526(), Z.ONE);
  }
}
