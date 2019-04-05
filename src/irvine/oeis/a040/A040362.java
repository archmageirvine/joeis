package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040362 Continued fraction for sqrt(382).
 * @author Georg Fischer
 */
public class A040362 extends PrependSequence {

  /** Construct the sequence. */
  public A040362() {
    super(new PeriodicSequence(1, 1, 5, 12, 1, 5, 1, 1, 2, 3, 1, 18, 1, 3, 2, 1, 1, 5, 1, 12, 5, 1, 1, 38), Z.valueOf(19));
  }
}
