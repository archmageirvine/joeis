package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040680 Continued fraction for <code>sqrt(707)</code>.
 * @author Georg Fischer
 */
public class A040680 extends PrependSequence {

  /** Construct the sequence. */
  public A040680() {
    super(new PeriodicSequence(1, 1, 2, 3, 2, 1, 1, 52), Z.valueOf(26));
  }
}
