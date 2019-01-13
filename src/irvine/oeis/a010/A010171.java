package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010171.
 * @author Sean A. Irvine
 */
public class A010171 extends PrependSequence {

  /** Construct the sequence. */
  public A010171() {
    super(new PeriodicSequence(6, 1, 2, 1, 1, 9, 1, 1, 2, 1, 6, 20), Z.TEN);
  }
}

