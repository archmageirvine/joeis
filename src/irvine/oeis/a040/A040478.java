package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040478 Continued fraction for sqrt(501).
 * @author Georg Fischer
 */
public class A040478 extends PrependSequence {

  /** Construct the sequence. */
  public A040478() {
    super(new PeriodicSequence(2, 1, 1, 1, 1, 3, 8, 1, 2, 10, 1, 5, 2, 14, 2, 5, 1, 10, 2, 1, 8, 3, 1, 1, 1, 1, 2, 44), Z.valueOf(22));
  }
}
