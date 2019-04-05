package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040706 Continued fraction for sqrt(734).
 * @author Georg Fischer
 */
public class A040706 extends PrependSequence {

  /** Construct the sequence. */
  public A040706() {
    super(new PeriodicSequence(10, 1, 4, 1, 1, 26, 1, 1, 4, 1, 10, 54), Z.valueOf(27));
  }
}
