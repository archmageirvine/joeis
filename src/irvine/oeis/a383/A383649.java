package irvine.oeis.a383;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a206.A206369;

/**
 * A383649 allocated for Shreyansh Jaiswal.
 * @author Sean A. Irvine
 */
public class A383649 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A383649() {
    super(1, new A206369(), Z::isProbablePrime);
  }
}

