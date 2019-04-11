package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040602 Continued fraction for <code>sqrt(628)</code>.
 * @author Georg Fischer
 */
public class A040602 extends PrependSequence {

  /** Construct the sequence. */
  public A040602() {
    super(new PeriodicSequence(16, 1, 2, 5, 4, 2, 1, 2, 2, 3, 1, 3, 12, 3, 1, 3, 2, 2, 1, 2, 4, 5, 2, 1, 16, 50), Z.valueOf(25));
  }
}
