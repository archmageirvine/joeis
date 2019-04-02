package irvine.oeis.a006;

import irvine.oeis.PartialSumSequence;
import irvine.oeis.SkipSequence;
import irvine.oeis.a004.A004068;

/**
 * A006322 4-dimensional analog of centered polygonal numbers.
 * @author Sean A. Irvine
 */
public class A006322 extends PartialSumSequence {

  /** Construct the sequence. */
  public A006322() {
    super(new SkipSequence(new A004068(), 1));
  }
}

