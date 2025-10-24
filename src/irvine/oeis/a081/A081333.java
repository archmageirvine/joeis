package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A081333 Numbers having more than one partition into two 3-smooth numbers.
 * @author Sean A. Irvine
 */
public class A081333 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A081333() {
    super(1, new A081326(), k -> k.compareTo(Z.ONE) > 0);
  }
}

