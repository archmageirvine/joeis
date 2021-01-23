package irvine.oeis.a170;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A170897 Number of new cells turned ON at generation n in cellular automaton described in A170896.
 * @author Sean A. Irvine
 */
public class A170897 extends DifferenceSequence {

  /** Construct the sequence. */
  public A170897() {
    super(new PrependSequence(new A170896(), 0));
  }
}
