package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040779 Continued fraction for sqrt(808).
 * @author Georg Fischer
 */
public class A040779 extends PrependSequence {

  /** Construct the sequence. */
  public A040779() {
    super(new PeriodicSequence(2, 2, 1, 5, 1, 1, 1, 1, 13, 1, 1, 1, 1, 5, 1, 2, 2, 56), Z.valueOf(28));
  }
}
