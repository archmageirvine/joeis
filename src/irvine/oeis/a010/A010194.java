package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010194.
 * @author Sean A. Irvine
 */
public class A010194 extends PrependSequence {

  /** Construct the sequence. */
  public A010194() {
    super(new PeriodicSequence(1, 1, 1, 1, 1, 1, 1, 22), Z.valueOf(11));
  }
}

