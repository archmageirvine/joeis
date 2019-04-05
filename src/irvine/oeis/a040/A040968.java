package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040968 Continued fraction for sqrt(1000).
 * @author Georg Fischer
 */
public class A040968 extends PrependSequence {

  /** Construct the sequence. */
  public A040968() {
    super(new PeriodicSequence(1, 1, 1, 1, 1, 6, 2, 2, 15, 2, 2, 6, 1, 1, 1, 1, 1, 62), Z.valueOf(31));
  }
}
