package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010214 Continued fraction for sqrt(166).
 * @author Sean A. Irvine
 */
public class A010214 extends PrependSequence {

  /** Construct the sequence. */
  public A010214() {
    super(new PeriodicSequence(1, 7, 1, 1, 1, 2, 4, 1, 3, 2, 12, 2, 3, 1, 4, 2, 1, 1, 1, 7, 1, 24), Z.valueOf(12));
  }
}

