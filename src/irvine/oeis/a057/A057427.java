package irvine.oeis.a057;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000012;

/**
 * A057427 <code>a(n) = 1</code> if <code>n &gt; 0, a(n) = 0</code> if <code>n = 0</code>; series expansion of <code>x/(1-x)</code>.
 * @author Sean A. Irvine
 */
public class A057427 extends PrependSequence {

  /** Construct the sequence. */
  public A057427() {
    super(new A000012(), 0);
  }
}
