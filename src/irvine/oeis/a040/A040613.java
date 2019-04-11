package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040613 Continued fraction for <code>sqrt(639)</code>.
 * @author Georg Fischer
 */
public class A040613 extends PrependSequence {

  /** Construct the sequence. */
  public A040613() {
    super(new PeriodicSequence(3, 1, 1, 2, 4, 4, 1, 4, 1, 4, 4, 2, 1, 1, 3, 50), Z.valueOf(25));
  }
}
