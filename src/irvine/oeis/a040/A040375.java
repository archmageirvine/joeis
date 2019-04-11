package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040375 Continued fraction for <code>sqrt(395)</code>.
 * @author Georg Fischer
 */
public class A040375 extends PrependSequence {

  /** Construct the sequence. */
  public A040375() {
    super(new PeriodicSequence(1, 6, 1, 38), Z.valueOf(19));
  }
}
