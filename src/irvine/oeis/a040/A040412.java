package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040412 Continued fraction for <code>sqrt(433)</code>.
 * @author Georg Fischer
 */
public class A040412 extends PrependSequence {

  /** Construct the sequence. */
  public A040412() {
    super(new PeriodicSequence(1, 4, 4, 2, 2, 1, 3, 13, 1, 1, 1, 1, 13, 3, 1, 2, 2, 4, 4, 1, 40), Z.valueOf(20));
  }
}
