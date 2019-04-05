package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040496 Continued fraction for sqrt(519).
 * @author Georg Fischer
 */
public class A040496 extends PrependSequence {

  /** Construct the sequence. */
  public A040496() {
    super(new PeriodicSequence(1, 3, 1, 1, 2, 1, 2, 3, 7, 3, 2, 1, 2, 1, 1, 3, 1, 44), Z.valueOf(22));
  }
}
