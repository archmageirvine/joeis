package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010209.
 * @author Sean A. Irvine
 */
public class A010209 extends PrependSequence {

  /** Construct the sequence. */
  public A010209() {
    super(new PeriodicSequence(1, 1, 1, 5, 1, 1, 1, 24), Z.valueOf(12));
  }
}

