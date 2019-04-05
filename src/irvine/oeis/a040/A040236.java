package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040236 Continued fraction for sqrt(252).
 * @author Georg Fischer
 */
public class A040236 extends PrependSequence {

  /** Construct the sequence. */
  public A040236() {
    super(new PeriodicSequence(1, 6, 1, 30), Z.valueOf(15));
  }
}
