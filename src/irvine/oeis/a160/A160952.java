package irvine.oeis.a160;

import irvine.oeis.FiniteSequence;

/**
 * A160952 a(n)=largest (n+1)-digit prime formed by appending a digit to a(n-1); a(0)=2.
 * @author Georg Fischer
 */
public class A160952 extends FiniteSequence {

  /** Construct the sequence. */
  public A160952() {
    super(2, 29, 293, 2939, 29399, 293999, 2939999, 29399999);
  }
}
