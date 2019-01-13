package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010204.
 * @author Sean A. Irvine
 */
public class A010204 extends PrependSequence {

  /** Construct the sequence. */
  public A010204() {
    super(new PeriodicSequence(2, 1, 2, 2, 2, 1, 2, 24), Z.valueOf(12));
  }
}

