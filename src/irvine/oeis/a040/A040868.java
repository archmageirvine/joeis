package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040868 Continued fraction for <code>sqrt(898)</code>.
 * @author Georg Fischer
 */
public class A040868 extends PrependSequence {

  /** Construct the sequence. */
  public A040868() {
    super(new PeriodicSequence(1, 28, 1, 58), Z.valueOf(29));
  }
}
