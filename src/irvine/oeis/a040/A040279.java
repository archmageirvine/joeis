package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040279 Continued fraction for <code>sqrt(297)</code>.
 * @author Georg Fischer
 */
public class A040279 extends PrependSequence {

  /** Construct the sequence. */
  public A040279() {
    super(new PeriodicSequence(4, 3, 1, 1, 2, 1, 1, 3, 4, 34), Z.valueOf(17));
  }
}
