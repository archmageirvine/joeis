package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040415 Continued fraction for sqrt(436).
 * @author Georg Fischer
 */
public class A040415 extends PrependSequence {

  /** Construct the sequence. */
  public A040415() {
    super(new PeriodicSequence(1, 7, 2, 1, 1, 1, 13, 3, 2, 2, 5, 1, 1, 4, 10, 4, 1, 1, 5, 2, 2, 3, 13, 1, 1, 1, 2, 7, 1, 40), Z.valueOf(20));
  }
}
