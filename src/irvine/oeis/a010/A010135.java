package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010135.
 * @author Sean A. Irvine
 */
public class A010135 extends PrependSequence {

  /** Construct the sequence. */
  public A010135() {
    super(new PeriodicSequence(1, 2, 2, 2, 1, 12), Z.SIX);
  }
}

