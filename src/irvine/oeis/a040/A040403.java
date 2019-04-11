package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040403 Continued fraction for <code>sqrt(424)</code>.
 * @author Georg Fischer
 */
public class A040403 extends PrependSequence {

  /** Construct the sequence. */
  public A040403() {
    super(new PeriodicSequence(1, 1, 2, 4, 5, 1, 1, 1, 9, 1, 1, 1, 5, 4, 2, 1, 1, 40), Z.valueOf(20));
  }
}
