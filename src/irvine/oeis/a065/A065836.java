package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000796;

/**
 * A065836 Quaternary digits found in decimal expansion of Pi.
 * @author Sean A. Irvine
 */
public class A065836 extends FilterSequence {

  /** Construct the sequence. */
  public A065836() {
    super(new A000796(), k -> Z.FOUR.compareTo(k) > 0);
  }
}

