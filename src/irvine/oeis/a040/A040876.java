package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040876 Continued fraction for sqrt(907).
 * @author Georg Fischer
 */
public class A040876 extends PrependSequence {

  /** Construct the sequence. */
  public A040876() {
    super(new PeriodicSequence(8, 1, 1, 2, 2, 1, 19, 2, 1, 2, 5, 9, 1, 5, 1, 3, 1, 3, 1, 1, 29, 1, 1, 3, 1, 3, 1, 5, 1, 9, 5, 2, 1, 2, 19, 1, 2, 2, 1, 1, 8, 60), Z.valueOf(30));
  }
}
