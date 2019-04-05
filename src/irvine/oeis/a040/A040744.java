package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040744 Continued fraction for sqrt(772).
 * @author Georg Fischer
 */
public class A040744 extends PrependSequence {

  /** Construct the sequence. */
  public A040744() {
    super(new PeriodicSequence(1, 3, 1, 1, 1, 5, 1, 1, 7, 2, 1, 1, 17, 1, 12, 1, 17, 1, 1, 2, 7, 1, 1, 5, 1, 1, 1, 3, 1, 54), Z.valueOf(27));
  }
}
