package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010125.
 * @author Sean A. Irvine
 */
public class A010125 extends PrependSequence {

  /** Construct the sequence. */
  public A010125() {
    super(new PeriodicSequence(1, 1, 2, 1, 1, 8), Z.FOUR);
  }
}

