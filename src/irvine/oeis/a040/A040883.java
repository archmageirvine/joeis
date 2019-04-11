package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040883 Continued fraction for <code>sqrt(914)</code>.
 * @author Georg Fischer
 */
public class A040883 extends PrependSequence {

  /** Construct the sequence. */
  public A040883() {
    super(new PeriodicSequence(4, 3, 3, 4, 60), Z.valueOf(30));
  }
}
