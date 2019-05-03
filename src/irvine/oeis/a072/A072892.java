package irvine.oeis.a072;

import irvine.oeis.FiniteSequence;

/**
 * A072892 The 4-cycle of the <code>n =&gt; sigma(n)-n</code> process. <code>sigma(n)</code> is the sum of divisors of n. <code>(A000203) a(4+n)=a(n)</code>.
 * @author Georg Fischer
 */
public class A072892 extends FiniteSequence {

  /** Construct the sequence. */
  public A072892() {
    super(1264460, 1547860, 1727636, 1305184, 1264460);
  }
}
