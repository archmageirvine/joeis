package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040800 Continued fraction for <code>sqrt(829)</code>.
 * @author Georg Fischer
 */
public class A040800 extends PrependSequence {

  /** Construct the sequence. */
  public A040800() {
    super(new PeriodicSequence(1, 3, 1, 4, 2, 3, 2, 1, 1, 2, 3, 2, 4, 1, 3, 1, 56), Z.valueOf(28));
  }
}
