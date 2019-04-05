package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040424 Continued fraction for sqrt(446).
 * @author Georg Fischer
 */
public class A040424 extends PrependSequence {

  /** Construct the sequence. */
  public A040424() {
    super(new PeriodicSequence(8, 2, 2, 1, 3, 1, 1, 20, 1, 1, 3, 1, 2, 2, 8, 42), Z.valueOf(21));
  }
}
