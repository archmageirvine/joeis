package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040658 Continued fraction for <code>sqrt(685)</code>.
 * @author Georg Fischer
 */
public class A040658 extends PrependSequence {

  /** Construct the sequence. */
  public A040658() {
    super(new PeriodicSequence(5, 1, 3, 1, 12, 3, 2, 2, 3, 12, 1, 3, 1, 5, 52), Z.valueOf(26));
  }
}
