package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040299 Continued fraction for sqrt(317).
 * @author Georg Fischer
 */
public class A040299 extends PrependSequence {

  /** Construct the sequence. */
  public A040299() {
    super(new PeriodicSequence(1, 4, 8, 1, 2, 2, 1, 8, 4, 1, 34), Z.valueOf(17));
  }
}
