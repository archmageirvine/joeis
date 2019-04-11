package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A040567 Continued fraction for <code>sqrt(592)</code>.
 * @author Georg Fischer
 */
public class A040567 extends PrependSequence {

  /** Construct the sequence. */
  public A040567() {
    super(new PeriodicSequence(3, 48), Z.valueOf(24));
  }
}
