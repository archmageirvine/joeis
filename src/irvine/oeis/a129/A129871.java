package irvine.oeis.a129;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000058;

/**
 * A129871 A variant of Sylvester's sequence: a(0)=1 and for n&gt;0, a(n) = (a(0)*a(1)*...*a(n-1)) + 1.
 * @author Georg Fischer
 */
public class A129871 extends PrependSequence {

  /** Construct the sequence. */
  public A129871() {
    super(new A000058(), 1);
  }
}
