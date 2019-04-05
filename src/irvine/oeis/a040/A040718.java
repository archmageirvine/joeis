package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040718 Continued fraction for sqrt(746).
 * @author Georg Fischer
 */
public class A040718 extends PrependSequence {

  /** Construct the sequence. */
  public A040718() {
    super(new PeriodicSequence(3, 5, 7, 1, 1, 1, 1, 1, 1, 7, 5, 3, 54), Z.valueOf(27));
  }
}
