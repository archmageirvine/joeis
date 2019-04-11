package irvine.oeis.a125;

import irvine.oeis.FiniteSequence;

/**
 * A125286 <code>a(0)=1</code>. <code>a(n) = a(n-1) +</code> (the largest term among <code>{a(0),a(1),</code>...a(n-1)} that has the same number of positive divisors as <code>n)</code>.
 * @author Georg Fischer
 */
public class A125286 extends FiniteSequence {

  /** Construct the sequence. */
  public A125286() {
    super(1, 2, 4, 6, 10, 12, 22, 24, 46, 50, 96, 98, 196, 198, 244, 290);
  }
}
