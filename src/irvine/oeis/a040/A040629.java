package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040629 Continued fraction for sqrt(655).
 * @author Georg Fischer
 */
public class A040629 extends PrependSequence {

  /** Construct the sequence. */
  public A040629() {
    super(new PeriodicSequence(1, 1, 2, 5, 3, 2, 8, 10, 8, 2, 3, 5, 2, 1, 1, 50), Z.valueOf(25));
  }
}
