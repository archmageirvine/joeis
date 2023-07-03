package irvine.oeis.a014;

import irvine.oeis.SkipSequence;
import irvine.oeis.a010.A010785;

/**
 * A014181 Numbers &gt; 9 with all digits the same.
 * @author Sean A. Irvine
 */
public class A014181 extends SkipSequence {

  /** Construct the sequence. */
  public A014181() {
    super(1, new A010785(), 10);
  }
}
