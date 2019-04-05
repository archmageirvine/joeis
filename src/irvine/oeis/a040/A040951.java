package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040951 Continued fraction for sqrt(983).
 * @author Georg Fischer
 */
public class A040951 extends PrependSequence {

  /** Construct the sequence. */
  public A040951() {
    super(new PeriodicSequence(2, 1, 5, 31, 5, 1, 2, 62), Z.valueOf(31));
  }
}
