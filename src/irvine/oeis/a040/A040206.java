package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040206 Continued fraction for <code>sqrt(221)</code>.
 * @author Georg Fischer
 */
public class A040206 extends PrependSequence {

  /** Construct the sequence. */
  public A040206() {
    super(new PeriodicSequence(1, 6, 2, 6, 1, 28), Z.valueOf(14));
  }
}
