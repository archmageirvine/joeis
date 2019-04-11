package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040211 Continued fraction for <code>sqrt(227)</code>.
 * @author Georg Fischer
 */
public class A040211 extends PrependSequence {

  /** Construct the sequence. */
  public A040211() {
    super(new PeriodicSequence(15, 30), Z.valueOf(15));
  }
}
