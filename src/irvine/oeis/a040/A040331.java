package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040331 Continued fraction for sqrt(350).
 * @author Georg Fischer
 */
public class A040331 extends PrependSequence {

  /** Construct the sequence. */
  public A040331() {
    super(new PeriodicSequence(1, 2, 2, 2, 1, 36), Z.valueOf(18));
  }
}
