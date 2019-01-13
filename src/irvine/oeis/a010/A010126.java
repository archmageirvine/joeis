package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010126.
 * @author Sean A. Irvine
 */
public class A010126 extends PrependSequence {

  /** Construct the sequence. */
  public A010126() {
    super(new PeriodicSequence(1, 2, 4, 2, 1, 8), Z.FOUR);
  }
}

