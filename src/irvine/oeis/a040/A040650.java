package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040650 Continued fraction for <code>sqrt(677)</code>.
 * @author Georg Fischer
 */
public class A040650 extends PrependSequence {

  /** Construct the sequence. */
  public A040650() {
    super(new PeriodicSequence(52), Z.valueOf(26));
  }
}
