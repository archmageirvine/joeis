package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040348 Continued fraction for sqrt(368).
 * @author Georg Fischer
 */
public class A040348 extends PrependSequence {

  /** Construct the sequence. */
  public A040348() {
    super(new PeriodicSequence(5, 2, 5, 38), Z.valueOf(19));
  }
}
