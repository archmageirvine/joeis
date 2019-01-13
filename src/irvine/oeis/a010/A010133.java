package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010133.
 * @author Sean A. Irvine
 */
public class A010133 extends PrependSequence {

  /** Construct the sequence. */
  public A010133() {
    super(new PeriodicSequence(2, 2, 12), Z.SIX);
  }
}

