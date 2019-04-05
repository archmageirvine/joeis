package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040585 Continued fraction for sqrt(610).
 * @author Georg Fischer
 */
public class A040585 extends PrependSequence {

  /** Construct the sequence. */
  public A040585() {
    super(new PeriodicSequence(1, 2, 3, 5, 5, 3, 2, 1, 48), Z.valueOf(24));
  }
}
