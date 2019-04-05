package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040427 Continued fraction for sqrt(449).
 * @author Georg Fischer
 */
public class A040427 extends PrependSequence {

  /** Construct the sequence. */
  public A040427() {
    super(new PeriodicSequence(5, 3, 1, 1, 1, 7, 1, 5, 5, 1, 7, 1, 1, 1, 3, 5, 42), Z.valueOf(21));
  }
}
