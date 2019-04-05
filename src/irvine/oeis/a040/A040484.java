package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040484 Continued fraction for sqrt(507).
 * @author Georg Fischer
 */
public class A040484 extends PrependSequence {

  /** Construct the sequence. */
  public A040484() {
    super(new PeriodicSequence(1, 1, 14, 1, 1, 44), Z.valueOf(22));
  }
}
