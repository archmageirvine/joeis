package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040711 Continued fraction for <code>sqrt(739)</code>.
 * @author Georg Fischer
 */
public class A040711 extends PrependSequence {

  /** Construct the sequence. */
  public A040711() {
    super(new PeriodicSequence(5, 2, 2, 1, 1, 3, 3, 2, 1, 8, 2, 1, 2, 1, 17, 2, 1, 1, 7, 5, 1, 10, 27, 10, 1, 5, 7, 1, 1, 2, 17, 1, 2, 1, 2, 8, 1, 2, 3, 3, 1, 1, 2, 2, 5, 54), Z.valueOf(27));
  }
}
