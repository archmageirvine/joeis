package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040648 Continued fraction for sqrt(674).
 * @author Georg Fischer
 */
public class A040648 extends PrependSequence {

  /** Construct the sequence. */
  public A040648() {
    super(new PeriodicSequence(1, 24, 1, 50), Z.valueOf(25));
  }
}
