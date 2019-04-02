package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010187 Continued fraction for sqrt(126).
 * @author Sean A. Irvine
 */
public class A010187 extends PrependSequence {

  /** Construct the sequence. */
  public A010187() {
    super(new PeriodicSequence(4, 2, 4, 22), Z.valueOf(11));
  }
}

