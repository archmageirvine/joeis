package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040747 Continued fraction for <code>sqrt(775)</code>.
 * @author Georg Fischer
 */
public class A040747 extends PrependSequence {

  /** Construct the sequence. */
  public A040747() {
    super(new PeriodicSequence(1, 5, 4, 1, 8, 2, 8, 1, 4, 5, 1, 54), Z.valueOf(27));
  }
}
