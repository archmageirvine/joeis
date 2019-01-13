package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010128.
 * @author Sean A. Irvine
 */
public class A010128 extends PrependSequence {

  /** Construct the sequence. */
  public A010128() {
    super(new PeriodicSequence(2, 1, 1, 2, 10), Z.FIVE);
  }
}

