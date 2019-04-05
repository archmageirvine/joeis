package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040230 Continued fraction for sqrt(246).
 * @author Georg Fischer
 */
public class A040230 extends PrependSequence {

  /** Construct the sequence. */
  public A040230() {
    super(new PeriodicSequence(1, 2, 5, 1, 14, 1, 5, 2, 1, 30), Z.valueOf(15));
  }
}
