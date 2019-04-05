package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040405 Continued fraction for sqrt(426).
 * @author Georg Fischer
 */
public class A040405 extends PrependSequence {

  /** Construct the sequence. */
  public A040405() {
    super(new PeriodicSequence(1, 1, 1, 3, 2, 6, 2, 3, 1, 1, 1, 40), Z.valueOf(20));
  }
}
