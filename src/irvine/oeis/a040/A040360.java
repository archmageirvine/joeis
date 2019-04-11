package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040360 Continued fraction for <code>sqrt(380)</code>.
 * @author Georg Fischer
 */
public class A040360 extends PrependSequence {

  /** Construct the sequence. */
  public A040360() {
    super(new PeriodicSequence(2, 38), Z.valueOf(19));
  }
}
