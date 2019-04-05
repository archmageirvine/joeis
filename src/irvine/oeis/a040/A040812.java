package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040812 Continued fraction for sqrt(842).
 * @author Georg Fischer
 */
public class A040812 extends PrependSequence {

  /** Construct the sequence. */
  public A040812() {
    super(new PeriodicSequence(58), Z.valueOf(29));
  }
}
