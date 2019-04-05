package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040676 Continued fraction for sqrt(703).
 * @author Georg Fischer
 */
public class A040676 extends PrependSequence {

  /** Construct the sequence. */
  public A040676() {
    super(new PeriodicSequence(1, 1, 17, 5, 1, 5, 17, 1, 1, 52), Z.valueOf(26));
  }
}
