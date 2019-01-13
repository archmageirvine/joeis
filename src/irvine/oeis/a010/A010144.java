package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010144.
 * @author Sean A. Irvine
 */
public class A010144 extends PrependSequence {

  /** Construct the sequence. */
  public A010144() {
    super(new PeriodicSequence(1, 2, 7, 2, 1, 14), Z.SEVEN);
  }
}

