package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040142 Continued fraction for sqrt(155).
 * @author Georg Fischer
 */
public class A040142 extends PrependSequence {

  /** Construct the sequence. */
  public A040142() {
    super(new PeriodicSequence(2, 4, 2, 24), Z.valueOf(12));
  }
}
