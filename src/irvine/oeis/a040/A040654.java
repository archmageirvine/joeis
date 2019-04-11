package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040654 Continued fraction for <code>sqrt(681)</code>.
 * @author Georg Fischer
 */
public class A040654 extends PrependSequence {

  /** Construct the sequence. */
  public A040654() {
    super(new PeriodicSequence(10, 2, 2, 1, 1, 2, 6, 7, 3, 2, 1, 16, 1, 2, 3, 7, 6, 2, 1, 1, 2, 2, 10, 52), Z.valueOf(26));
  }
}
