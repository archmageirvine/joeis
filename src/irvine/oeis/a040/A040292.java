package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040292 Continued fraction for <code>sqrt(310)</code>.
 * @author Georg Fischer
 */
public class A040292 extends PrependSequence {

  /** Construct the sequence. */
  public A040292() {
    super(new PeriodicSequence(1, 1, 1, 1, 5, 3, 1, 2, 1, 3, 5, 1, 1, 1, 1, 34), Z.valueOf(17));
  }
}
