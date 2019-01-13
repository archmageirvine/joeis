package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010129.
 * @author Sean A. Irvine
 */
public class A010129 extends PrependSequence {

  /** Construct the sequence. */
  public A010129() {
    super(new PeriodicSequence(1, 1, 3, 5, 3, 1, 1, 10), Z.FIVE);
  }
}

