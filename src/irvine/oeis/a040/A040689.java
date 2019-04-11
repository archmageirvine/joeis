package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040689 Continued fraction for <code>sqrt(716)</code>.
 * @author Georg Fischer
 */
public class A040689 extends PrependSequence {

  /** Construct the sequence. */
  public A040689() {
    super(new PeriodicSequence(1, 3, 7, 2, 1, 1, 6, 10, 1, 1, 4, 2, 1, 12, 1, 2, 4, 1, 1, 10, 6, 1, 1, 2, 7, 3, 1, 52), Z.valueOf(26));
  }
}
