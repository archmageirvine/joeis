package irvine.oeis.a102;

import irvine.oeis.FiniteSequence;

/**
 * A102701 Non-&quot;Ding!Bong!&quot; numbers: positive numbers which are not a positive linear combination of 5&apos;s and 7&apos;s.
 * @author Georg Fischer
 */
public class A102701 extends FiniteSequence {

  /** Construct the sequence. */
  public A102701() {
    super(1, 2, 3, 4, 6, 8, 9, 11, 13, 16, 18, 23);
  }
}
