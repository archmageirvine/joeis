package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040821 Continued fraction for <code>sqrt(851)</code>.
 * @author Georg Fischer
 */
public class A040821 extends PrependSequence {

  /** Construct the sequence. */
  public A040821() {
    super(new PeriodicSequence(5, 1, 4, 2, 7, 1, 7, 2, 4, 1, 5, 58), Z.valueOf(29));
  }
}
