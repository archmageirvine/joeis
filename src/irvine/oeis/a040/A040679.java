package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040679 Continued fraction for sqrt(706).
 * @author Georg Fischer
 */
public class A040679 extends PrependSequence {

  /** Construct the sequence. */
  public A040679() {
    super(new PeriodicSequence(1, 1, 3, 26, 3, 1, 1, 52), Z.valueOf(26));
  }
}
