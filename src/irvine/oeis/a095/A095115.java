package irvine.oeis.a095;

import irvine.oeis.FiniteSequence;

/**
 * A095115 <code>a(1)=1</code>. Given <code>a(1),...,a(n-1)</code>, to find <code>a(n)</code>, let S <code>= {a(1)</code>, ..., <code>a(n-1), |a(2)-a(1)|</code>, ..., <code>|a(n-1)-a(n-2)|}</code>. Let d be the smallest positive integer not in S. Then <code>a(n)</code> is the smallest one of <code>a(n-1)-d</code> and <code>a(n-1)+d</code> which is a positive integer not in S union <code>{d}</code>.
 * @author Georg Fischer
 */
public class A095115 extends FiniteSequence {

  /** Construct the sequence. */
  public A095115() {
    super(1, 3, 7, 12, 18, 10, 19, 30, 17, 31, 16, 36, 57, 35, 58, 34, 59, 33, 60, 32, 61, 98, 136, 97, 137, 96, 54);
  }
}
