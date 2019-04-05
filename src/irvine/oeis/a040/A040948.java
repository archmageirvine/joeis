package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040948 Continued fraction for sqrt(980).
 * @author Georg Fischer
 */
public class A040948 extends PrependSequence {

  /** Construct the sequence. */
  public A040948() {
    super(new PeriodicSequence(3, 3, 1, 1, 2, 1, 1, 3, 3, 62), Z.valueOf(31));
  }
}
