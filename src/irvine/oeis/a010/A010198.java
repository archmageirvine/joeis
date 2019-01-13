package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010198.
 * @author Sean A. Irvine
 */
public class A010198 extends PrependSequence {

  /** Construct the sequence. */
  public A010198() {
    super(new PeriodicSequence(1, 3, 1, 3, 7, 1, 1, 2, 11, 2, 1, 1, 7, 3, 1, 3, 1, 22), Z.valueOf(11));
  }
}

