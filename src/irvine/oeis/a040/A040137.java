package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040137 Continued fraction for sqrt(150).
 * @author Georg Fischer
 */
public class A040137 extends PrependSequence {

  /** Construct the sequence. */
  public A040137() {
    super(new PeriodicSequence(4, 24), Z.valueOf(12));
  }
}
