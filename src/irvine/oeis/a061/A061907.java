package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.FilterPositionSequence;

/**
 * A061907 The iterative cycle: n -&gt; sum of digits of n^2 has only four distinct elements.
 * @author Sean A. Irvine
 */
public class A061907 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A061907() {
    super(1, 0, new A061903(), Z.FOUR::equals);
  }
}
