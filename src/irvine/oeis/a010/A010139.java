package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010139.
 * @author Sean A. Irvine
 */
public class A010139 extends PrependSequence {

  /** Construct the sequence. */
  public A010139() {
    super(new PeriodicSequence(3, 1, 1, 3, 14), Z.SEVEN);
  }
}

