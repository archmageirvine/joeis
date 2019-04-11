package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040912 Continued fraction for <code>sqrt(943)</code>.
 * @author Georg Fischer
 */
public class A040912 extends PrependSequence {

  /** Construct the sequence. */
  public A040912() {
    super(new PeriodicSequence(1, 2, 2, 2, 1, 60), Z.valueOf(30));
  }
}
