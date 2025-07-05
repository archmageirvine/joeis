package irvine.oeis.a078;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A078122.
 * @author Sean A. Irvine
 */
public class A078555 extends DifferenceSequence {

  /** Construct the sequence. */
  public A078555() {
    super(0, new PrependSequence(new A078662(), 0));
  }
}

