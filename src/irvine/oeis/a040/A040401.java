package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040401 Continued fraction for <code>sqrt(422)</code>.
 * @author Georg Fischer
 */
public class A040401 extends PrependSequence {

  /** Construct the sequence. */
  public A040401() {
    super(new PeriodicSequence(1, 1, 5, 2, 1, 3, 20, 3, 1, 2, 5, 1, 1, 40), Z.valueOf(20));
  }
}
