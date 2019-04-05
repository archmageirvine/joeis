package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040670 Continued fraction for sqrt(697).
 * @author Georg Fischer
 */
public class A040670 extends PrependSequence {

  /** Construct the sequence. */
  public A040670() {
    super(new PeriodicSequence(2, 2, 52), Z.valueOf(26));
  }
}
