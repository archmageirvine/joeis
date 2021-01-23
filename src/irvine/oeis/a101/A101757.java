package irvine.oeis.a101;

import irvine.oeis.SemiprimeSequence;
import irvine.oeis.a000.A000073;

/**
 * A101757 Indices of semiprime tribonacci numbers.
 * @author Sean A. Irvine
 */
public class A101757 extends SemiprimeSequence {

  /** Construct the sequence. */
  public A101757() {
    super(new A000073(), 0);
  }
}
