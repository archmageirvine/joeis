package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010205.
 * @author Sean A. Irvine
 */
public class A010205 extends PrependSequence {

  /** Construct the sequence. */
  public A010205() {
    super(new PeriodicSequence(2, 2, 3, 1, 2, 1, 3, 2, 2, 24), Z.valueOf(12));
  }
}

