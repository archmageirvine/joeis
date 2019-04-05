package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040655 Continued fraction for sqrt(682).
 * @author Georg Fischer
 */
public class A040655 extends PrependSequence {

  /** Construct the sequence. */
  public A040655() {
    super(new PeriodicSequence(8, 1, 2, 5, 2, 5, 2, 1, 8, 52), Z.valueOf(26));
  }
}
