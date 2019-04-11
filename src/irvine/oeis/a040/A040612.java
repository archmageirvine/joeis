package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040612 Continued fraction for <code>sqrt(638)</code>.
 * @author Georg Fischer
 */
public class A040612 extends PrependSequence {

  /** Construct the sequence. */
  public A040612() {
    super(new PeriodicSequence(3, 1, 6, 2, 6, 1, 3, 50), Z.valueOf(25));
  }
}
