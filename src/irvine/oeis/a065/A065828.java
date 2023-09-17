package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000796;

/**
 * A065828 Binary digits found in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A065828 extends FilterSequence {

  /** Construct the sequence. */
  public A065828() {
    super(new A000796(), k -> Z.TWO.compareTo(k) > 0);
  }
}

