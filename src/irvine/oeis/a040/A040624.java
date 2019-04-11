package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040624 Continued fraction for <code>sqrt(650)</code>.
 * @author Georg Fischer
 */
public class A040624 extends PrependSequence {

  /** Construct the sequence. */
  public A040624() {
    super(new PeriodicSequence(2, 50), Z.valueOf(25));
  }
}
