package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010160.
 * @author Sean A. Irvine
 */
public class A010160 extends PrependSequence {

  /** Construct the sequence. */
  public A010160() {
    super(new PeriodicSequence(2, 1, 1, 1, 2, 18), Z.NINE);
  }
}

