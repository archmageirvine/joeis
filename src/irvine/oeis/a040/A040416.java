package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040416 Continued fraction for sqrt(437).
 * @author Georg Fischer
 */
public class A040416 extends PrependSequence {

  /** Construct the sequence. */
  public A040416() {
    super(new PeriodicSequence(1, 9, 2, 9, 1, 40), Z.valueOf(20));
  }
}
