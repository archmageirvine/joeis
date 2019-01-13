package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010188.
 * @author Sean A. Irvine
 */
public class A010188 extends PrependSequence {

  /** Construct the sequence. */
  public A010188() {
    super(new PeriodicSequence(3, 1, 2, 2, 7, 11, 7, 2, 2, 1, 3, 22), Z.valueOf(11));
  }
}

