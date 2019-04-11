package irvine.oeis.a032;

import irvine.oeis.FiniteSequence;

/**
 * A032772 <code>n(n+1)(n+2)</code>...(n+5) <code>/ (n+(n+1)+(n+2)+</code>...+(n+5)) is <code>an</code> integer.
 * @author Georg Fischer
 */
public class A032772 extends FiniteSequence {

  /** Construct the sequence. */
  public A032772() {
    super(0, 5, 10, 35);
  }
}
