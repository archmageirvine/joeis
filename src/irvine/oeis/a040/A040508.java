package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040508 Continued fraction for sqrt(532).
 * @author Georg Fischer
 */
public class A040508 extends PrependSequence {

  /** Construct the sequence. */
  public A040508() {
    super(new PeriodicSequence(15, 2, 1, 4, 2, 4, 1, 2, 15, 46), Z.valueOf(23));
  }
}
