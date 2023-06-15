package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a000.A000607;

/**
 * A064153.
 * @author Sean A. Irvine
 */
public class A064153 extends ComplementSequence {

  /** Construct the sequence. */
  public A064153() {
    super(new SkipSequence(new A000607(), 2), Z.ONE);
  }
}
