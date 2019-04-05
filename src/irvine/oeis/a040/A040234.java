package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040234 Continued fraction for sqrt(250).
 * @author Georg Fischer
 */
public class A040234 extends PrependSequence {

  /** Construct the sequence. */
  public A040234() {
    super(new PeriodicSequence(1, 4, 3, 3, 4, 1, 30), Z.valueOf(15));
  }
}
