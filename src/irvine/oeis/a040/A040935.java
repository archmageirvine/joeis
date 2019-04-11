package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040935 Continued fraction for <code>sqrt(967)</code>.
 * @author Georg Fischer
 */
public class A040935 extends PrependSequence {

  /** Construct the sequence. */
  public A040935() {
    super(new PeriodicSequence(10, 2, 1, 6, 4, 3, 2, 2, 1, 1, 8, 3, 2, 1, 20, 31, 20, 1, 2, 3, 8, 1, 1, 2, 2, 3, 4, 6, 1, 2, 10, 62), Z.valueOf(31));
  }
}
