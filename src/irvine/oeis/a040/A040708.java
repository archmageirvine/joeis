package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040708 Continued fraction for <code>sqrt(736)</code>.
 * @author Georg Fischer
 */
public class A040708 extends PrependSequence {

  /** Construct the sequence. */
  public A040708() {
    super(new PeriodicSequence(7, 1, 2, 1, 2, 1, 7, 54), Z.valueOf(27));
  }
}
