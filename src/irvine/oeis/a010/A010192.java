package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010192.
 * @author Sean A. Irvine
 */
public class A010192 extends PrependSequence {

  /** Construct the sequence. */
  public A010192() {
    super(new PeriodicSequence(1, 1, 7, 5, 1, 1, 1, 2, 1, 1, 1, 5, 7, 1, 1, 22), Z.valueOf(11));
  }
}

