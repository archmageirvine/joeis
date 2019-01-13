package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010207.
 * @author Sean A. Irvine
 */
public class A010207 extends PrependSequence {

  /** Construct the sequence. */
  public A010207() {
    super(new PeriodicSequence(1, 1, 3, 12, 3, 1, 1, 24), Z.valueOf(12));
  }
}

