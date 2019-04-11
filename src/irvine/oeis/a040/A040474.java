package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040474 Continued fraction for <code>sqrt(497)</code>.
 * @author Georg Fischer
 */
public class A040474 extends PrependSequence {

  /** Construct the sequence. */
  public A040474() {
    super(new PeriodicSequence(3, 2, 2, 5, 6, 5, 2, 2, 3, 44), Z.valueOf(22));
  }
}
