package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040231 Continued fraction for sqrt(247).
 * @author Georg Fischer
 */
public class A040231 extends PrependSequence {

  /** Construct the sequence. */
  public A040231() {
    super(new PeriodicSequence(1, 2, 1, 1, 9, 1, 9, 1, 1, 2, 1, 30), Z.valueOf(15));
  }
}
