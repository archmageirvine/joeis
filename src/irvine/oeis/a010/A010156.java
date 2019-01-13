package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010156.
 * @author Sean A. Irvine
 */
public class A010156 extends PrependSequence {

  /** Construct the sequence. */
  public A010156() {
    super(new PeriodicSequence(1, 4, 1, 16), Z.EIGHT);
  }
}

