package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040430 Continued fraction for <code>sqrt(452)</code>.
 * @author Georg Fischer
 */
public class A040430 extends PrependSequence {

  /** Construct the sequence. */
  public A040430() {
    super(new PeriodicSequence(3, 1, 5, 3, 10, 3, 5, 1, 3, 42), Z.valueOf(21));
  }
}
