package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040687 Continued fraction for sqrt(714).
 * @author Georg Fischer
 */
public class A040687 extends PrependSequence {

  /** Construct the sequence. */
  public A040687() {
    super(new PeriodicSequence(1, 2, 1, 1, 2, 1, 1, 2, 1, 52), Z.valueOf(26));
  }
}
