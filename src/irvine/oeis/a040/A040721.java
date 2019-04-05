package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040721 Continued fraction for sqrt(749).
 * @author Georg Fischer
 */
public class A040721 extends PrependSequence {

  /** Construct the sequence. */
  public A040721() {
    super(new PeriodicSequence(2, 1, 2, 1, 1, 4, 2, 1, 1, 13, 10, 1, 6, 1, 10, 13, 1, 1, 2, 4, 1, 1, 2, 1, 2, 54), Z.valueOf(27));
  }
}
