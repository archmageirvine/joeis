package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040492 Continued fraction for sqrt(515).
 * @author Georg Fischer
 */
public class A040492 extends PrependSequence {

  /** Construct the sequence. */
  public A040492() {
    super(new PeriodicSequence(1, 2, 3, 1, 3, 1, 3, 2, 1, 44), Z.valueOf(22));
  }
}
