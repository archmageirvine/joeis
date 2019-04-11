package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040945 Continued fraction for <code>sqrt(977)</code>.
 * @author Georg Fischer
 */
public class A040945 extends PrependSequence {

  /** Construct the sequence. */
  public A040945() {
    super(new PeriodicSequence(3, 1, 8, 5, 1, 1, 3, 7, 1, 1, 7, 3, 1, 1, 5, 8, 1, 3, 62), Z.valueOf(31));
  }
}
