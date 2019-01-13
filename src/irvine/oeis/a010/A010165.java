package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010165.
 * @author Sean A. Irvine
 */
public class A010165 extends PrependSequence {

  /** Construct the sequence. */
  public A010165() {
    super(new PeriodicSequence(1, 2, 3, 1, 1, 5, 1, 8, 1, 5, 1, 1, 3, 2, 1, 18), Z.NINE);
  }
}

