package irvine.oeis.a048;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A048831 Number of rooted identity game trees of height n, first player to reach to reach top wins. Second player wins.
 * @author Sean A. Irvine
 */
public class A048831 extends DifferenceSequence {

  /** Construct the sequence. */
  public A048831() {
    super(new PrependSequence(new A048829(), 0));
  }
}
