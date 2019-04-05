package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040447 Continued fraction for sqrt(469).
 * @author Georg Fischer
 */
public class A040447 extends PrependSequence {

  /** Construct the sequence. */
  public A040447() {
    super(new PeriodicSequence(1, 1, 1, 10, 6, 10, 1, 1, 1, 42), Z.valueOf(21));
  }
}
