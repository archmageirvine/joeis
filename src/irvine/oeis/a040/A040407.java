package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040407 Continued fraction for sqrt(428).
 * @author Georg Fischer
 */
public class A040407 extends PrependSequence {

  /** Construct the sequence. */
  public A040407() {
    super(new PeriodicSequence(1, 2, 4, 1, 5, 10, 5, 1, 4, 2, 1, 40), Z.valueOf(20));
  }
}
