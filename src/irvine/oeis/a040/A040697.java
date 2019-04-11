package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040697 Continued fraction for <code>sqrt(724)</code>.
 * @author Georg Fischer
 */
public class A040697 extends PrependSequence {

  /** Construct the sequence. */
  public A040697() {
    super(new PeriodicSequence(1, 9, 1, 3, 1, 1, 2, 1, 4, 5, 1, 3, 3, 3, 17, 1, 1, 1, 2, 1, 12, 1, 2, 1, 1, 1, 17, 3, 3, 3, 1, 5, 4, 1, 2, 1, 1, 3, 1, 9, 1, 52), Z.valueOf(26));
  }
}
