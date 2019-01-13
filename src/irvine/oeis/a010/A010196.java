package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010196.
 * @author Sean A. Irvine
 */
public class A010196 extends PrependSequence {

  /** Construct the sequence. */
  public A010196() {
    super(new PeriodicSequence(1, 2, 2, 1, 1, 2, 2, 1, 22), Z.valueOf(11));
  }
}

