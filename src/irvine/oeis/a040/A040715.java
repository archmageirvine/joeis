package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040715 Continued fraction for sqrt(743).
 * @author Georg Fischer
 */
public class A040715 extends PrependSequence {

  /** Construct the sequence. */
  public A040715() {
    super(new PeriodicSequence(3, 1, 7, 27, 7, 1, 3, 54), Z.valueOf(27));
  }
}
