package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040759 Continued fraction for sqrt(788).
 * @author Georg Fischer
 */
public class A040759 extends PrependSequence {

  /** Construct the sequence. */
  public A040759() {
    super(new PeriodicSequence(14, 56), Z.valueOf(28));
  }
}
