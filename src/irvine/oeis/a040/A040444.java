package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040444 Continued fraction for sqrt(466).
 * @author Georg Fischer
 */
public class A040444 extends PrependSequence {

  /** Construct the sequence. */
  public A040444() {
    super(new PeriodicSequence(1, 1, 2, 2, 1, 2, 5, 1, 3, 1, 20, 1, 3, 1, 5, 2, 1, 2, 2, 1, 1, 42), Z.valueOf(21));
  }
}
