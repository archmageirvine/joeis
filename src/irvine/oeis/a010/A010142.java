package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010142.
 * @author Sean A. Irvine
 */
public class A010142 extends PrependSequence {

  /** Construct the sequence. */
  public A010142() {
    super(new PeriodicSequence(1, 1, 4, 1, 1, 14), Z.SEVEN);
  }
}

