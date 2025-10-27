package irvine.oeis.a081;

import irvine.oeis.Conjectural;
import irvine.oeis.PartialSumSequence;
import irvine.oeis.PrependSequence;
import irvine.oeis.a008.A008486;

/**
 * A081359 Problem 49 on page 235 of Mathematics: California Edition, by Carole Greenes et al.
 * @author Sean A. Irvine
 */
public class A081359 extends PartialSumSequence implements Conjectural {

  /** Construct the sequence. */
  public A081359() {
    super(1, new PrependSequence(new A008486(), 6));
  }
}

