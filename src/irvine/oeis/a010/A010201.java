package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010201 Continued fraction for sqrt(142).
 * @author Sean A. Irvine
 */
public class A010201 extends PrependSequence {

  /** Construct the sequence. */
  public A010201() {
    super(new PeriodicSequence(1, 10, 1, 22), Z.valueOf(11));
  }
}

