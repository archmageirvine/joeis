package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040808 Continued fraction for sqrt(837).
 * @author Georg Fischer
 */
public class A040808 extends PrependSequence {

  /** Construct the sequence. */
  public A040808() {
    super(new PeriodicSequence(1, 13, 2, 13, 1, 56), Z.valueOf(28));
  }
}
