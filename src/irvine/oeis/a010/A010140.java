package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010140 Continued fraction for sqrt(54).
 * @author Sean A. Irvine
 */
public class A010140 extends PrependSequence {

  /** Construct the sequence. */
  public A010140() {
    super(new PeriodicSequence(2, 1, 6, 1, 2, 14), Z.SEVEN);
  }
}

