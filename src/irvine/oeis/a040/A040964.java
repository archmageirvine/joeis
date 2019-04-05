package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040964 Continued fraction for sqrt(996).
 * @author Georg Fischer
 */
public class A040964 extends PrependSequence {

  /** Construct the sequence. */
  public A040964() {
    super(new PeriodicSequence(1, 1, 3, 1, 2, 2, 1, 1, 1, 4, 1, 1, 1, 2, 2, 1, 3, 1, 1, 62), Z.valueOf(31));
  }
}
