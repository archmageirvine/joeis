package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010190.
 * @author Sean A. Irvine
 */
public class A010190 extends PrependSequence {

  /** Construct the sequence. */
  public A010190() {
    super(new PeriodicSequence(2, 1, 3, 1, 6, 1, 3, 1, 2, 22), Z.valueOf(11));
  }
}

