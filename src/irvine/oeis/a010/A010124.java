package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010124.
 * @author Sean A. Irvine
 */
public class A010124 extends PrependSequence {

  /** Construct the sequence. */
  public A010124() {
    super(new PeriodicSequence(2, 1, 3, 1, 2, 8), Z.FOUR);
  }
}

