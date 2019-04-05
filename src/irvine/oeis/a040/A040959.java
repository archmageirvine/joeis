package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040959 Continued fraction for sqrt(991).
 * @author Georg Fischer
 */
public class A040959 extends PrependSequence {

  /** Construct the sequence. */
  public A040959() {
    super(new PeriodicSequence(2, 12, 10, 2, 2, 2, 1, 1, 2, 6, 1, 1, 1, 1, 3, 1, 8, 4, 1, 2, 1, 2, 3, 1, 4, 1, 20, 6, 4, 31, 4, 6, 20, 1, 4, 1, 3, 2, 1, 2, 1, 4, 8, 1, 3, 1, 1, 1, 1, 6, 2, 1, 1, 2, 2, 2, 10, 12, 2, 62), Z.valueOf(31));
  }
}
