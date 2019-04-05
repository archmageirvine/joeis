package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040888 Continued fraction for sqrt(919).
 * @author Georg Fischer
 */
public class A040888 extends PrependSequence {

  /** Construct the sequence. */
  public A040888() {
    super(new PeriodicSequence(3, 5, 1, 2, 1, 2, 1, 1, 1, 2, 3, 1, 19, 2, 3, 1, 1, 4, 9, 1, 7, 1, 3, 6, 2, 11, 1, 1, 1, 29, 1, 1, 1, 11, 2, 6, 3, 1, 7, 1, 9, 4, 1, 1, 3, 2, 19, 1, 3, 2, 1, 1, 1, 2, 1, 2, 1, 5, 3, 60), Z.valueOf(30));
  }
}
