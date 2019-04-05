package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040440 Continued fraction for sqrt(462).
 * @author Georg Fischer
 */
public class A040440 extends PrependSequence {

  /** Construct the sequence. */
  public A040440() {
    super(new PeriodicSequence(2, 42), Z.valueOf(21));
  }
}
