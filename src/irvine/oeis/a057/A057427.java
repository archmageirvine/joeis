package irvine.oeis.a057;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000012;

/**
 * A057427 a(n) = 1 if n &gt; 0, a(n) = 0 if n = 0; series expansion of x/(1-x).
 * @author Sean A. Irvine
 */
public class A057427 extends PrependSequence {

  /** Construct the sequence. */
  public A057427() {
    super(new A000012(), 0);
  }
}
