package irvine.oeis.a087;

import irvine.oeis.FiniteSequence;

/**
 * A087312 <code>a(1) = 1;</code> for <code>n &gt; 1, a(n)</code> is the smallest number <code>== -1 (mod a(n-1))</code>, greater than n, with the same prime signature as <code>n</code>.
 * @author Georg Fischer
 */
public class A087312 extends FiniteSequence {

  /** Construct the sequence. */
  public A087312() {
    super(1, 3, 5, 9, 17, 33, 131, 143055667L);
  }
}
