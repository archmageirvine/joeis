package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010132.
 * @author Sean A. Irvine
 */
public class A010132 extends PrependSequence {

  /** Construct the sequence. */
  public A010132() {
    super(new PeriodicSequence(1, 4, 1, 10), Z.FIVE);
  }
}

