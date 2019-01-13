package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010158.
 * @author Sean A. Irvine
 */
public class A010158 extends PrependSequence {

  /** Construct the sequence. */
  public A010158() {
    super(new PeriodicSequence(4, 1, 1, 4, 18), Z.NINE);
  }
}

