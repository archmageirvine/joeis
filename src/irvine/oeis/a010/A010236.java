package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.PrependSequence;

/**
 * A010236.
 * @author Sean A. Irvine
 */
public class A010236 extends PrependSequence {

  /** Construct the sequence. */
  public A010236() {
    super(new PeriodicSequence(1, 12, 1, 26), Z.valueOf(13));
  }
}

