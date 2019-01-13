package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010166.
 * @author Sean A. Irvine
 */
public class A010166 extends PrependSequence {

  /** Construct the sequence. */
  public A010166() {
    super(new PeriodicSequence(1, 2, 1, 18), Z.NINE);
  }
}

