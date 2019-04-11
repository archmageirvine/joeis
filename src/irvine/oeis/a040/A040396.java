package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040396 Continued fraction for <code>sqrt(417)</code>.
 * @author Georg Fischer
 */
public class A040396 extends PrependSequence {

  /** Construct the sequence. */
  public A040396() {
    super(new PeriodicSequence(2, 2, 1, 1, 1, 5, 4, 1, 12, 1, 4, 5, 1, 1, 1, 2, 2, 40), Z.valueOf(20));
  }
}
