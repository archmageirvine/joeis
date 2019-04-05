package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040072 Continued fraction for sqrt(82).
 * @author Georg Fischer
 */
public class A040072 extends PrependSequence {

  /** Construct the sequence. */
  public A040072() {
    super(new PeriodicSequence(18), Z.valueOf(9));
  }
}
