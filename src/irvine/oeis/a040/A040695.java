package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040695 Continued fraction for sqrt(722).
 * @author Georg Fischer
 */
public class A040695 extends PrependSequence {

  /** Construct the sequence. */
  public A040695() {
    super(new PeriodicSequence(1, 6, 1, 2, 3, 2, 26, 2, 3, 2, 1, 6, 1, 52), Z.valueOf(26));
  }
}
