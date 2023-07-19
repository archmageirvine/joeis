package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A064590 Ordered values of A064494.
 * @author Sean A. Irvine
 */
public class A064590 extends ComplementSequence {

  /** Construct the sequence. */
  public A064590() {
    super(1, new A064627(), Z.ONE);
  }
}

