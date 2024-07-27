package irvine.oeis.a071;

import irvine.oeis.a006.A006862;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A071554 Smallest x &gt; 1 such that x^prime(n) == 1 mod(prime(i)) 2&lt;=i&lt;=n.
 * @author Sean A. Irvine
 */
public class A071554 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A071554() {
    super(2, new A006862().skip(2), k -> k.add(1).divide2());
  }
}
