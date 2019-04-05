package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040660 Continued fraction for sqrt(687).
 * @author Georg Fischer
 */
public class A040660 extends PrependSequence {

  /** Construct the sequence. */
  public A040660() {
    super(new PeriodicSequence(4, 1, 2, 1, 16, 1, 2, 1, 4, 52), Z.valueOf(26));
  }
}
