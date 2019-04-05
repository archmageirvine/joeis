package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040924 Continued fraction for sqrt(955).
 * @author Georg Fischer
 */
public class A040924 extends PrependSequence {

  /** Construct the sequence. */
  public A040924() {
    super(new PeriodicSequence(1, 9, 3, 6, 1, 1, 5, 12, 5, 1, 1, 6, 3, 9, 1, 60), Z.valueOf(30));
  }
}
