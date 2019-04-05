package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040777 Continued fraction for sqrt(806).
 * @author Georg Fischer
 */
public class A040777 extends PrependSequence {

  /** Construct the sequence. */
  public A040777() {
    super(new PeriodicSequence(2, 1, 1, 3, 2, 5, 4, 5, 2, 3, 1, 1, 2, 56), Z.valueOf(28));
  }
}
