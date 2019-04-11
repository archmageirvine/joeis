package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040672 Continued fraction for <code>sqrt(699)</code>.
 * @author Georg Fischer
 */
public class A040672 extends PrependSequence {

  /** Construct the sequence. */
  public A040672() {
    super(new PeriodicSequence(2, 3, 1, 1, 2, 1, 25, 1, 2, 1, 1, 3, 2, 52), Z.valueOf(26));
  }
}
