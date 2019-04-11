package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040681 Continued fraction for <code>sqrt(708)</code>.
 * @author Georg Fischer
 */
public class A040681 extends PrependSequence {

  /** Construct the sequence. */
  public A040681() {
    super(new PeriodicSequence(1, 1, 1, 1, 4, 4, 4, 1, 1, 1, 1, 52), Z.valueOf(26));
  }
}
