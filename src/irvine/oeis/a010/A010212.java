package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010212 Continued fraction for sqrt(163).
 * @author Sean A. Irvine
 */
public class A010212 extends PrependSequence {

  /** Construct the sequence. */
  public A010212() {
    super(new PeriodicSequence(1, 3, 3, 2, 1, 1, 7, 1, 11, 1, 7, 1, 1, 2, 3, 3, 1, 24), Z.valueOf(12));
  }
}

