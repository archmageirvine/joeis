package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040757 Continued fraction for sqrt(786).
 * @author Georg Fischer
 */
public class A040757 extends PrependSequence {

  /** Construct the sequence. */
  public A040757() {
    super(new PeriodicSequence(28, 56), Z.valueOf(28));
  }
}
