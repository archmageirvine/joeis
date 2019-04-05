package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040645 Continued fraction for sqrt(671).
 * @author Georg Fischer
 */
public class A040645 extends PrependSequence {

  /** Construct the sequence. */
  public A040645() {
    super(new PeriodicSequence(1, 9, 2, 1, 1, 1, 2, 9, 1, 50), Z.valueOf(25));
  }
}
