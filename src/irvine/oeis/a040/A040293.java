package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040293 Continued fraction for sqrt(311).
 * @author Georg Fischer
 */
public class A040293 extends PrependSequence {

  /** Construct the sequence. */
  public A040293() {
    super(new PeriodicSequence(1, 1, 1, 2, 1, 6, 3, 17, 3, 6, 1, 2, 1, 1, 1, 34), Z.valueOf(17));
  }
}
