package irvine.oeis.a387;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A387351 Positions of -1's in A387348.
 * @author Sean A. Irvine
 */
public class A387351 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A387351() {
    super(1, new A387348(), Z.NEG_ONE::equals);
  }
}

