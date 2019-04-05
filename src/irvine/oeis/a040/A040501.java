package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040501 Continued fraction for sqrt(524).
 * @author Georg Fischer
 */
public class A040501 extends PrependSequence {

  /** Construct the sequence. */
  public A040501() {
    super(new PeriodicSequence(1, 8, 5, 1, 1, 1, 1, 2, 1, 10, 1, 2, 1, 1, 1, 1, 5, 8, 1, 44), Z.valueOf(22));
  }
}
