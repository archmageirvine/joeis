package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010164.
 * @author Sean A. Irvine
 */
public class A010164 extends PrependSequence {

  /** Construct the sequence. */
  public A010164() {
    super(new PeriodicSequence(1, 1, 1, 4, 6, 4, 1, 1, 1, 18), Z.NINE);
  }
}

