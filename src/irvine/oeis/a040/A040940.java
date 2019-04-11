package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040940 Continued fraction for <code>sqrt(972)</code>.
 * @author Georg Fischer
 */
public class A040940 extends PrependSequence {

  /** Construct the sequence. */
  public A040940() {
    super(new PeriodicSequence(5, 1, 1, 1, 7, 6, 1, 3, 1, 14, 1, 3, 1, 6, 7, 1, 1, 1, 5, 62), Z.valueOf(31));
  }
}
