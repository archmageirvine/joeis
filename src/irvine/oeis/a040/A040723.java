package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040723 Continued fraction for sqrt(751).
 * @author Georg Fischer
 */
public class A040723 extends PrependSequence {

  /** Construct the sequence. */
  public A040723() {
    super(new PeriodicSequence(2, 2, 8, 1, 2, 1, 3, 5, 1, 4, 1, 1, 1, 3, 1, 1, 3, 10, 1, 2, 7, 2, 17, 1, 4, 27, 4, 1, 17, 2, 7, 2, 1, 10, 3, 1, 1, 3, 1, 1, 1, 4, 1, 5, 3, 1, 2, 1, 8, 2, 2, 54), Z.valueOf(27));
  }
}
