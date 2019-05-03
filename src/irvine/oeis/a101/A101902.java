package irvine.oeis.a101;

import irvine.oeis.FiniteSequence;

/**
 * A101902 Numbers n that are not of the form <code>ab+bc+cd+de+ea</code> with <code>1&lt;=a&lt;=b&lt;=c&lt;=d&lt;=e</code>.
 * @author Georg Fischer
 */
public class A101902 extends FiniteSequence {

  /** Construct the sequence. */
  public A101902() {
    super(1, 2, 3, 4, 6, 8, 12, 14, 18, 30, 38, 42, 62);
  }
}
