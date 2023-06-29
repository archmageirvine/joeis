package irvine.oeis.a052;

import irvine.oeis.PrependSequence;
import irvine.oeis.ZeroSpacedSequence;
import irvine.oeis.a000.A000672;

/**
 * A052120 Number of 3-valent trees (= boron trees or binary trees) with n nodes.
 * @author Sean A. Irvine
 */
public class A052120 extends PrependSequence {

  /** Construct the sequence. */
  public A052120() {
    super(1, new ZeroSpacedSequence(new A000672(), 1), 1);
  }
}
