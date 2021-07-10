package irvine.oeis.a048;

import irvine.oeis.DifferenceSequence;
import irvine.oeis.PrependSequence;

/**
 * A048832 Number of rooted identity game trees of height n, first player to reach to reach top wins. First player wins.
 * @author Sean A. Irvine
 */
public class A048832 extends DifferenceSequence {

  /** Construct the sequence. */
  public A048832() {
    super(new PrependSequence(new A048830(), 0));
  }
}
