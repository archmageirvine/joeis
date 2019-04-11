package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040861 Continued fraction for <code>sqrt(891)</code>.
 * @author Georg Fischer
 */
public class A040861 extends PrependSequence {

  /** Construct the sequence. */
  public A040861() {
    super(new PeriodicSequence(1, 5, 1, 1, 1, 5, 1, 58), Z.valueOf(29));
  }
}
