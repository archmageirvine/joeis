package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040394 Continued fraction for <code>sqrt(415)</code>.
 * @author Georg Fischer
 */
public class A040394 extends PrependSequence {

  /** Construct the sequence. */
  public A040394() {
    super(new PeriodicSequence(2, 1, 2, 4, 6, 1, 1, 3, 1, 1, 6, 4, 2, 1, 2, 40), Z.valueOf(20));
  }
}
